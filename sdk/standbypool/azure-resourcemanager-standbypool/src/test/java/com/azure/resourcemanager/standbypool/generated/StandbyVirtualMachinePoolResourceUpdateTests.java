// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolElasticityProfile;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResourceUpdate;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResourceUpdateProperties;
import com.azure.resourcemanager.standbypool.models.VirtualMachineState;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class StandbyVirtualMachinePoolResourceUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StandbyVirtualMachinePoolResourceUpdate model = BinaryData.fromString(
            "{\"tags\":{\"tnapczwlokjyemkk\":\"ejhkry\",\"joxzjnchgejspodm\":\"ni\"},\"properties\":{\"elasticityProfile\":{\"maxReadyCapacity\":3873613065529551563},\"virtualMachineState\":\"Running\",\"attachedVirtualMachineScaleSetId\":\"o\"}}")
            .toObject(StandbyVirtualMachinePoolResourceUpdate.class);
        Assertions.assertEquals("ejhkry", model.tags().get("tnapczwlokjyemkk"));
        Assertions.assertEquals(3873613065529551563L, model.properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.RUNNING, model.properties().virtualMachineState());
        Assertions.assertEquals("o", model.properties().attachedVirtualMachineScaleSetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StandbyVirtualMachinePoolResourceUpdate model = new StandbyVirtualMachinePoolResourceUpdate()
            .withTags(mapOf("tnapczwlokjyemkk", "ejhkry", "joxzjnchgejspodm", "ni"))
            .withProperties(new StandbyVirtualMachinePoolResourceUpdateProperties()
                .withElasticityProfile(
                    new StandbyVirtualMachinePoolElasticityProfile().withMaxReadyCapacity(3873613065529551563L))
                .withVirtualMachineState(VirtualMachineState.RUNNING)
                .withAttachedVirtualMachineScaleSetId("o"));
        model = BinaryData.fromObject(model).toObject(StandbyVirtualMachinePoolResourceUpdate.class);
        Assertions.assertEquals("ejhkry", model.tags().get("tnapczwlokjyemkk"));
        Assertions.assertEquals(3873613065529551563L, model.properties().elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.RUNNING, model.properties().virtualMachineState());
        Assertions.assertEquals("o", model.properties().attachedVirtualMachineScaleSetId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
