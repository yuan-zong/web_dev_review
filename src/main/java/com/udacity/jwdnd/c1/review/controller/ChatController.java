package com.udacity.jwdnd.c1.review.controller;

import com.udacity.jwdnd.c1.review.model.ChatForm;
import com.udacity.jwdnd.c1.review.model.ChatMessage;
import com.udacity.jwdnd.c1.review.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chat")
public class ChatController {
    MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public ChatController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String getChatPage(Model model) {
        model.addAttribute("messages", this.messageService.getMessages());
        return "chat";
    }

    @PostMapping
    public String addMessage(@ModelAttribute("newMessage") ChatForm newMessage, Model model) {
        String messageText;
        if (newMessage.getMessageType().equals("Shout")) {
            messageText = newMessage.getMessageText().toUpperCase();
        } else if (newMessage.getMessageType().equals("Whisper")) {
            messageText = newMessage.getMessageText().toLowerCase();
        } else {
            messageText = newMessage.getMessageText();
        }
        messageService.addMessage(new ChatMessage(messageText, newMessage.getUserName()));
        model.addAttribute("messages", this.messageService.getMessages());
        return "chat";
    }
}
