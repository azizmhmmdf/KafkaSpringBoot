package com.example.kafkawithspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class User {
  private String id;
  private String first_name;
  private String last_name;
}
