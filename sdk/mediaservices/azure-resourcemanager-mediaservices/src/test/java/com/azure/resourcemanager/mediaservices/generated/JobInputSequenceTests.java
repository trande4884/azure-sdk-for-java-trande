// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ClipTime;
import com.azure.resourcemanager.mediaservices.models.InputDefinition;
import com.azure.resourcemanager.mediaservices.models.JobInputClip;
import com.azure.resourcemanager.mediaservices.models.JobInputSequence;
import com.azure.resourcemanager.mediaservices.models.TrackDescriptor;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JobInputSequenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobInputSequence model = BinaryData.fromString(
            "{\"@odata.type\":\"#Microsoft.Media.JobInputSequence\",\"inputs\":[{\"@odata.type\":\"#Microsoft.Media.JobInputClip\",\"files\":[\"asiibmiybnnust\",\"nlj\",\"nmgixh\"],\"start\":{\"@odata.type\":\"ClipTime\"},\"end\":{\"@odata.type\":\"ClipTime\"},\"label\":\"mqfoudorh\",\"inputDefinitions\":[{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"}]},{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"}]},{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"}]}]},{\"@odata.type\":\"#Microsoft.Media.JobInputClip\",\"files\":[\"undmbx\",\"ugcmjkavlgorb\",\"ftpmdtzfjltfv\"],\"start\":{\"@odata.type\":\"ClipTime\"},\"end\":{\"@odata.type\":\"ClipTime\"},\"label\":\"jtotpvopvpbd\",\"inputDefinitions\":[{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"}]},{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"}]},{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"}]},{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"}]}]},{\"@odata.type\":\"#Microsoft.Media.JobInputClip\",\"files\":[\"wthmkyib\",\"ysi\"],\"start\":{\"@odata.type\":\"ClipTime\"},\"end\":{\"@odata.type\":\"ClipTime\"},\"label\":\"cw\",\"inputDefinitions\":[{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"}]},{\"@odata.type\":\"InputDefinition\",\"includedTracks\":[{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"},{\"@odata.type\":\"TrackDescriptor\"}]}]}]}")
            .toObject(JobInputSequence.class);
        Assertions.assertEquals("asiibmiybnnust", model.inputs().get(0).files().get(0));
        Assertions.assertEquals("mqfoudorh", model.inputs().get(0).label());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobInputSequence model
            = new JobInputSequence()
                .withInputs(
                    Arrays
                        .asList(
                            new JobInputClip().withFiles(Arrays.asList("asiibmiybnnust", "nlj", "nmgixh"))
                                .withStart(new ClipTime())
                                .withEnd(new ClipTime())
                                .withLabel("mqfoudorh")
                                .withInputDefinitions(Arrays.asList(
                                    new InputDefinition().withIncludedTracks(Arrays.asList(new TrackDescriptor())),
                                    new InputDefinition().withIncludedTracks(Arrays
                                        .asList(new TrackDescriptor(), new TrackDescriptor(), new TrackDescriptor())),
                                    new InputDefinition().withIncludedTracks(Arrays.asList(new TrackDescriptor())))),
                            new JobInputClip().withFiles(Arrays.asList("undmbx", "ugcmjkavlgorb", "ftpmdtzfjltfv"))
                                .withStart(new ClipTime())
                                .withEnd(new ClipTime())
                                .withLabel("jtotpvopvpbd")
                                .withInputDefinitions(Arrays.asList(
                                    new InputDefinition().withIncludedTracks(Arrays.asList(new TrackDescriptor(),
                                        new TrackDescriptor(), new TrackDescriptor(), new TrackDescriptor())),
                                    new InputDefinition().withIncludedTracks(Arrays.asList(new TrackDescriptor())),
                                    new InputDefinition().withIncludedTracks(Arrays
                                        .asList(new TrackDescriptor(), new TrackDescriptor(), new TrackDescriptor())),
                                    new InputDefinition().withIncludedTracks(Arrays.asList(new TrackDescriptor(),
                                        new TrackDescriptor(), new TrackDescriptor())))),
                            new JobInputClip().withFiles(Arrays.asList("wthmkyib", "ysi"))
                                .withStart(new ClipTime())
                                .withEnd(new ClipTime())
                                .withLabel("cw")
                                .withInputDefinitions(Arrays.asList(
                                    new InputDefinition().withIncludedTracks(
                                        Arrays.asList(new TrackDescriptor(), new TrackDescriptor())),
                                    new InputDefinition().withIncludedTracks(Arrays.asList(new TrackDescriptor(),
                                        new TrackDescriptor(), new TrackDescriptor()))))));
        model = BinaryData.fromObject(model).toObject(JobInputSequence.class);
        Assertions.assertEquals("asiibmiybnnust", model.inputs().get(0).files().get(0));
        Assertions.assertEquals("mqfoudorh", model.inputs().get(0).label());
    }
}
