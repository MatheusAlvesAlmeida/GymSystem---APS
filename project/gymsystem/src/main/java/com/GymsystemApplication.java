package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class GymsystemApplication {

  public static void main(String... args) {
    SpringApplication.run(GymsystemApplication.class, args);
  }
}