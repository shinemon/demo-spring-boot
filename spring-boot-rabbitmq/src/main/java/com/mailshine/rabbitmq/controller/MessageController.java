package com.mailshine.rabbitmq.controller;

import com.mailshine.rabbitmq.model.Student;
import com.mailshine.rabbitmq.service.RabbitMQService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MessageController {

    @Autowired
    RabbitMQService rabbitMQService;

    @PostMapping(value = "/api/send/student/info")
    public String sendStudentData(@RequestBody Student student){
        log.info("Attempting send message to RabbitMQService");

        rabbitMQService.sendMessage(student);
        return "Sent Message";
    }
}