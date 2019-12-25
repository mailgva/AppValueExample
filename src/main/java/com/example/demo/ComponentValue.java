package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ComponentValue {
  @Value("${x.appvalue}")
  private String appValue;

  @Bean
  public String getAppValue() {
    return appValue;
  }
}
