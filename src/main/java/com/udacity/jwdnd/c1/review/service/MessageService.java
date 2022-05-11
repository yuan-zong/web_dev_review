package com.udacity.jwdnd.c1.review.service;

import com.udacity.jwdnd.c1.review.model.ChatMessage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Service
public class MessageService {

    ArrayList<ChatMessage> messages;

    public MessageService() {
        System.out.println("MessageService");
    }

//    public String upperCase() {
//        return message.toUpperCase();
//    }
//
//    public String lowerCase() {
//        return message.toLowerCase();
//    }

    public void addMessage(ChatMessage message) {
        messages.add(message);
    }

    public ArrayList<ChatMessage> getMessages() {
        return messages;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct MessageService");
        messages = new ArrayList<>();
    }

    @ModelAttribute("allMessageTypes")
    public String[] allMessageTypes () {
        System.out.println("allMessageTypes");
        return new String[] { "Say", "Shout", "Whisper" };
    }
}
