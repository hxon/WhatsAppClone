package com.example.whatsappclone.chat;

import java.util.ArrayList;


public class Chat {
    private String chatId;
    private String title;

    private ArrayList<String> users = new ArrayList<>();

    public Chat(String chatId, String title, ArrayList<String> users) {
        this.chatId = chatId;
        this.title = title;
        this.users = users;
    }

    public Chat(String chatId, String title) {
        this.chatId = chatId;
        this.title = title;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatId='" + chatId + '\'' +
                ", title='" + title + '\'' +
                ", users=" + users +
                '}';
    }
}
