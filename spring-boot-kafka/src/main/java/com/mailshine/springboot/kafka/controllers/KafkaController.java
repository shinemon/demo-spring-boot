package com.mailshine.springboot.kafka.controllers;

import com.mailshine.springboot.kafka.model.Student;
import com.mailshine.springboot.kafka.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class KafkaController {

    @Autowired
    ProducerService producerService;

    @PostMapping (value = "/send/student/info")
    public String kafkaMessage(@RequestBody Student message){
        producerService.sendMessage(message.toString());
        return "Success";
    }
}
