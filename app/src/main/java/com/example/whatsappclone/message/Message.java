package com.example.whatsappclone.message;

public class Message {
    private String messageId, text, senderId;

    public Message(String messageId, String text, String senderId) {
        this.messageId = messageId;
        this.text = text;
        this.senderId = senderId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
}
