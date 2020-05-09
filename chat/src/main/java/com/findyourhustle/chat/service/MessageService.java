package com.findyourhustle.chat.service;

import com.findyourhustle.chat.domain.Message;
import com.findyourhustle.chat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public void saveMessage(Message message){
        this.messageRepository.save(message);
    }
}
