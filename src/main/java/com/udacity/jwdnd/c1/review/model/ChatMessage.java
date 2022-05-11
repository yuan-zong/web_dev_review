package com.udacity.jwdnd.c1.review.model;

public class ChatMessage {
    private String messageText;
    private String userName;
//    MessageType messageType;


    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ChatMessage(String messageText, String userName) {
        this.messageText = messageText;
        this.userName = userName;
    }
}
