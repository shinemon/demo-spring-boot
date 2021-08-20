package com.mailshine.springboot.resilience4j.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ApplicationConfig {

  @Configuration
  public static class BrowserHistoryConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
      registry
              .addResourceHandler("swagger-ui.html")
              .addResourceLocations("classpath:/META-INF/resources/");

      registry
              .addResourceHandler("/webjars/**")
              .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
  }
}
