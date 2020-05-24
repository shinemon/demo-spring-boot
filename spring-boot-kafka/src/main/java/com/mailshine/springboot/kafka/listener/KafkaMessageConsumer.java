package com.mailshine.springboot.kafka.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageConsumer {

  @KafkaListener(topics = "shine-test-local-topic", groupId = "shine-local")
  public void listen(String message) {
    log.info("Received Messasge in group : {}", message);
  }
}
