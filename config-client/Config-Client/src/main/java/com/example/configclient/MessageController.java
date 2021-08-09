package com.example.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private MessageDao messageDao;

    @GetMapping("/message")
    public Message message()
    {
        return messageDao.save(new Message("Hello"));
    }
}
