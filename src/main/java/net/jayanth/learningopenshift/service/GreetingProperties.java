package net.jayanth.learningopenshift.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("greeting")
public class GreetingProperties {

  /**
   * This message has to be set in the application.yml file. If application is executed locally, "local" profile is
   * expected. On OpenShift, this property is set by a ConfigMap.
   */
  private String message = null;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}