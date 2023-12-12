package com.example.kafkawithspringboot.controllers;

import com.example.kafkawithspringboot.model.User;
import com.example.kafkawithspringboot.services.JsonKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/kafka")
public class JsonMessageController {
  private JsonKafkaProducer jsonkafkaProducer;
  public JsonMessageController(JsonKafkaProducer jsonkafkaProducer) {
    this.jsonkafkaProducer = jsonkafkaProducer;
  }

  @PostMapping("/publish")
  public ResponseEntity<String> publish(@RequestBody User user){
    jsonkafkaProducer.sendMessage(user);
    return ResponseEntity.ok("Json message send to kafka topic");
  }
}
