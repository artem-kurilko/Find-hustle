package com.findyourhustle.chat.resources;

import com.findyourhustle.chat.domain.Message;
import com.findyourhustle.chat.repository.MessageRepository;
import com.findyourhustle.chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @Autowired
    private MessageService messageService;

    @MessageMapping("/message")
    @SendTo("/chat/messages")
    public Message getMessages(Message message) {
        this.messageService.saveMessage(message);
        System.out.println(message);
        return message;
    }
}
