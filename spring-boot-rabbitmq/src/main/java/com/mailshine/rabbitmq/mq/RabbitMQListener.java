package com.mailshine.rabbitmq.mq;

import com.mailshine.rabbitmq.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
public class RabbitMQListener {

    @RabbitListener(queues = "${queue}")
    public void messageListener(Student message){
        log.info("Received Message from RabbitMQ Listener: {}", message.toString());
    }
}
