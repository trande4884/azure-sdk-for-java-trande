// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Details of the message to send.
 */
@Fluent
public final class SendChatMessageOptions {
    /*
     * Chat message content.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /*
     * The display name of the chat message sender. This property is used to populate sender name for push
     * notifications.
     */
    @JsonProperty(value = "senderDisplayName")
    private String senderDisplayName;

    /*
     * The chat message type.
     */
    @JsonProperty(value = "type")
    private ChatMessageType type;

    /*
     * Message metadata.
     */
    @JsonProperty(value = "metadata")
    private Map<String, String> metadata;

    /**
     * Creates an instance of SendChatMessageOptions class.
     */
    public SendChatMessageOptions() {
    }

    /**
     * Get the content property: Chat message content.
     * 
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: Chat message content.
     * 
     * @param content the content value to set.
     * @return the SendChatMessageOptions object itself.
     */
    public SendChatMessageOptions setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the senderDisplayName property: The display name of the chat message sender. This property is used to
     * populate sender name for push notifications.
     * 
     * @return the senderDisplayName value.
     */
    public String getSenderDisplayName() {
        return this.senderDisplayName;
    }

    /**
     * Set the senderDisplayName property: The display name of the chat message sender. This property is used to
     * populate sender name for push notifications.
     * 
     * @param senderDisplayName the senderDisplayName value to set.
     * @return the SendChatMessageOptions object itself.
     */
    public SendChatMessageOptions setSenderDisplayName(String senderDisplayName) {
        this.senderDisplayName = senderDisplayName;
        return this;
    }

    /**
     * Get the type property: The chat message type.
     * 
     * @return the type value.
     */
    public ChatMessageType getType() {
        return this.type;
    }

    /**
     * Set the type property: The chat message type.
     * 
     * @param type the type value to set.
     * @return the SendChatMessageOptions object itself.
     */
    public SendChatMessageOptions setType(ChatMessageType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the metadata property: Message metadata.
     * 
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Message metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the SendChatMessageOptions object itself.
     */
    public SendChatMessageOptions setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
