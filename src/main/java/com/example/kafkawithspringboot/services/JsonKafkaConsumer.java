package com.example.kafkawithspringboot.services;

import com.example.kafkawithspringboot.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
  private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

  @KafkaListener(topics = "exampleJsonTopic", groupId = "mygroup")
  public void consume(User user){
    LOGGER.info(String.format("Message received ->  %s", user));
  }
}
