package com.kafka.producer.kafkaproducer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.function.Supplier;

@Configuration
public class KafkaProducer {
  @Bean
  public Supplier<String> messageProducer() {
    return () -> "Hello World! Current time is " + LocalDateTime.now();
  }
}
