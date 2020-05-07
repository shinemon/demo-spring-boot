package com.mailshine.demo.jms.activemq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Slf4j
@Component
public class Listener implements MessageListener {

    @Override
    public void onMessage(Message message) {

        String payload = null;
        try {
            payload = ((TextMessage)message).getText();
            log.info("Received Message : " +  payload);
        } catch (JMSException e) {
            log.error("Error Processing Message " + e.toString());
        }
    }
}
