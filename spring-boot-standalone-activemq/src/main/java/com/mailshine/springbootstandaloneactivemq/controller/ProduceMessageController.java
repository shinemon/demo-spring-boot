package com.mailshine.springbootstandaloneactivemq.controller;

import com.mailshine.springbootstandaloneactivemq.jms.JmsProducer;
import com.mailshine.springbootstandaloneactivemq.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProduceMessageController {

    @Autowired
    JmsProducer jmsProducer;

    @PostMapping(value="/api/employee")
    public Employee sendMessage(@RequestBody Employee employee){
        jmsProducer.sendMessage(employee);
        return employee;
    }
}
