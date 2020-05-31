package com.mailshine.springboot.kafka.avro.listener;

import com.mailshine.springboot.kafka.avro.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaAvroMessageConsumer {

  @KafkaListener(topics = "shine-test-local-avro-topic", groupId = "shine-local-avro")
  public void listen(Student message) {
    log.info("Received Messasge in group : {}", message);
  }
}
