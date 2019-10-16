package com.example.muzix.configuration;

import io.swagger.models.properties.AbstractProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.AbstractEnvironment;


@Configuration
@EnableAutoConfiguration
public class AppConfig {
  private static final Logger log = LoggerFactory.getLogger(AppConfig.class);

  @Bean
  @Profile("dev")
  public void whichEnvironment(){
    System.out.println(System.getProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME));
  }

  @Bean
  @Profile("prod")
  public void inProdEnvironment(){
    log.debug("in production environment");
  }
}
