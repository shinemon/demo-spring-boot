package com.mailshine.message.consumer.handling.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class MessageRouter implements Consumer<Object> {

    @Override
    public void accept(Object o) {
        if (true) {

        } else if (false) {

        } else {
            //defaultHandling
        }
    }
}
