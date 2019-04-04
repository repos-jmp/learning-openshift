package net.jayanth.learningopenshift.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class GreetingController {

  @Autowired
  private GreetingProperties properties;

  @RequestMapping("/api/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    Objects.requireNonNull(properties.getMessage(), "Greeting message was not set in the properties");

    String message = String.format(properties.getMessage(), name);
    return new Greeting(message);
  }
}