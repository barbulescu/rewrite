/*
 * Copyright 2022 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.remote;

import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openrewrite.*;
import org.openrewrite.marker.Markers;
import org.openrewrite.marker.SearchResult;
import org.openrewrite.scheduling.RecipeRunCycle;
import org.openrewrite.test.MockHttpSender;
import org.openrewrite.text.Find;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;

import static java.util.Objects.requireNonNull;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RemoteArchiveTest {

    @ParameterizedTest
    @ValueSource(strings = {"7.4.2", "7.5-rc-1", "7.6"})
    void gradleWrapper(String version) throws Exception {
        URL distributionUrl = requireNonNull(RemoteArchiveTest.class.getClassLoader().getResource("gradle-" + version + "-bin.zip"));
        ExecutionContext ctx = new InMemoryExecutionContext();
        RemoteExecutionContextView.view(ctx).setArtifactCache(new LocalRemoteArtifactCache(
          Paths.get(System.getProperty("user.home") + "/.rewrite/remote/gradleWrapper")));
        HttpSenderExecutionContextView.view(ctx)
          .setLargeFileHttpSender(new MockHttpSender(distributionUrl::openStream));

        RemoteArchive remoteArchive = Remote
          .builder(
            Paths.get("gradle/wrapper/gradle-wrapper.jar"),
            distributionUrl.toURI()
          )
          .build("gradle-[^\\/]+\\/(?:.*\\/)+gradle-wrapper-(?!shared).*\\.jar");

        long actual = getInputStreamSize(remoteArchive.getInputStream(ctx));
        assertThat(actual).isGreaterThan(50_000);
    }

    @Test
    void gradleWrapperDownloadFails() throws Exception {
        URL distributionUrl = requireNonNull(RemoteArchiveTest.class.getClassLoader().getResource("gradle-7.4.2-bin.zip"));
        ExecutionContext ctx = new InMemoryExecutionContext();
        RemoteExecutionContextView.view(ctx).setArtifactCache(new LocalRemoteArtifactCache(
          Paths.get(System.getProperty("user.home") + "/.rewrite/remote/gradleWrapperDownloadFails")));
        HttpSenderExecutionContextView.view(ctx)
          .setLargeFileHttpSender(new MockHttpSender(408));

        RemoteArchive remoteArchive = Remote
          .builder(
            Paths.get("gradle/wrapper/gradle-wrapper.jar"),
            distributionUrl.toURI()
          )
          .build("gradle-[^\\/]+\\/(?:.*\\/)+gradle-wrapper-(?!shared).*\\.jar");

        assertThatThrownBy(() -> getInputStreamSize(remoteArchive.getInputStream(ctx)))
          .isInstanceOf(IllegalStateException.class)
          .hasMessage("Failed to download " + distributionUrl.toURI() + " to artifact cache");
    }

    @ParameterizedTest
    @ValueSource(strings = {"7.4.2", "7.5-rc-1", "7.6"})
    void gradleWrapperConcurrent(String version) throws Exception {
        int executionCount = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(executionCount);
        CompletionService<Long> completionService = new ExecutorCompletionService<>(executorService);
        LocalRemoteArtifactCache localRemoteArtifactCache = new LocalRemoteArtifactCache(
          Paths.get(System.getProperty("user.home") + "/.rewrite/remote/gradleWrapperConcurrent"));

        for (int i = 0; i < executionCount; i++) {
            completionService.submit(() -> {
                URL distributionUrl = requireNonNull(RemoteArchiveTest.class.getClassLoader()
                  .getResource("gradle-" + version + "-bin.zip"));

                ExecutionContext ctx = new InMemoryExecutionContext();
                RemoteExecutionContextView.view(ctx).setArtifactCache(localRemoteArtifactCache);
                HttpSenderExecutionContextView.view(ctx)
                  .setLargeFileHttpSender(new MockHttpSender(distributionUrl::openStream));

                RemoteArchive remoteArchive = Remote
                  .builder(
                    Paths.get("gradle/wrapper/gradle-wrapper.jar"),
                    distributionUrl.toURI()
                  )
                  .build("gradle-[^\\/]+\\/(?:.*\\/)+gradle-wrapper-(?!shared).*\\.jar");

                return getInputStreamSize(remoteArchive.getInputStream(ctx));
            });
        }

        for (int i = 0; i < executionCount; i++) {
            Future<Long> result = completionService.take();
            Long actual = result.get();
            assertThat(actual).isGreaterThan(50_000);
        }

        executorService.shutdown();
    }

    @Test
    void printingRemoteArchive() throws URISyntaxException {
        URL zipUrl = requireNonNull(RemoteArchiveTest.class.getClassLoader().getResource("zipfile.zip"));

        RemoteArchive remoteArchive = Remote
          .builder(
            Paths.get("content.txt"),
            zipUrl.toURI()
          )
          .build("content.txt");

        ExecutionContext ctx = new InMemoryExecutionContext();
        RemoteExecutionContextView.view(ctx).setArtifactCache(new LocalRemoteArtifactCache(
          Paths.get(System.getProperty("user.home") + "/.rewrite/remote/gradleWrapper")));
        HttpSenderExecutionContextView.view(ctx)
          .setLargeFileHttpSender(new MockHttpSender(zipUrl::openStream));

        String printed = remoteArchive.printAll(new PrintOutputCapture<>(ctx, PrintOutputCapture.MarkerPrinter.DEFAULT));
        assertThat(printed).isEqualTo("this is a zipped file");
    }


    @Test
    void printingRemoteArchiveWithMarker() throws URISyntaxException {
        URL zipUrl = requireNonNull(RemoteArchiveTest.class.getClassLoader().getResource("zipfile.zip"));


        ExecutionContext ctx = new InMemoryExecutionContext();
        RemoteExecutionContextView.view(ctx).setArtifactCache(new LocalRemoteArtifactCache(
          Paths.get(System.getProperty("user.home") + "/.rewrite/remote/gradleWrapper")));
        HttpSenderExecutionContextView.view(ctx)
          .setLargeFileHttpSender(new MockHttpSender(zipUrl::openStream));


        RemoteArchive remoteArchive = Remote
          .builder(
            UUID.randomUUID(),
            Paths.get("content.txt"),
            Markers.build(List.of(new SearchResult(UUID.randomUUID(),"this is a marker"))),
            zipUrl.toURI()
          )
          .build("content.txt");

        String printed = remoteArchive.printAll(new PrintOutputCapture<>(ctx, PrintOutputCapture.MarkerPrinter.DEFAULT));
        assertThat(printed).isEqualTo("~~>this is a zipped file");
    }

    private Long getInputStreamSize(InputStream is) {
        BlackHoleOutputStream out = new BlackHoleOutputStream();
        try {
            return is.transferTo(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
