package com.mailshine.message.consumer.handling.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Slf4j
@Component
public class Listener implements MessageListener {

    @Autowired
    MessageRouter router;

    @Override
    public void onMessage(Message message) {

        Object payload = null;
        try {
            payload = ((TextMessage) message).getText();

            if (true) {
                router.accept(payload);
            } else {
                log.info("Message is ignore as it doesnt match Filter criteria");
            }
        } catch (JMSException e) {
            log.error("Error Processing Message " + e.toString());
        }
    }
}
