package com.mailshine.rabbitmq.service;


import com.mailshine.rabbitmq.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQService {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value(("${exchange.name}"))
    private String exchangeName;

    @Value("${routing.key}")
    private String routngKey;

    public void sendMessage(Student student){
        log.info("Starting: Send Message to RabbitMQ.");
        rabbitTemplate.convertAndSend(exchangeName, routngKey, student);
        log.info("Sent Message to RabbitMQ with payload: {}", student.toString());
    }
}
