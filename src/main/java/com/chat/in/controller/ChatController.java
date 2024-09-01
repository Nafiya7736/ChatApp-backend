package com.chat.in.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.in.model.Message;
import com.chat.in.service.ChatService;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin(origins = "*")
public class ChatController {
    @Autowired
    private ChatService chatService;

    @GetMapping("/view")
    public List<Message> getMessages() {
        return chatService.getAllMessages();
    }

    @PostMapping("/add")
    public Message postMessage(@RequestBody Message message) {
        return chatService.saveMessage(message);
    }
}
