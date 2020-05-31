package com.mailshine.springboot.kafka.avro.controller;


import com.mailshine.springboot.kafka.avro.model.Student;
import com.mailshine.springboot.kafka.avro.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class KafkaAvroController {

    @Autowired
    ProducerService producerService;

    @PostMapping(value = "/send/avro/student/info")
    public String kafkaMessage(@RequestBody Student message) {

        //Student students = Student.newBuilder().setStudentName("shine").setStudentId("129").setAge(25).build();
        producerService.sendMessage(message);
        return "Success";
    }
}
