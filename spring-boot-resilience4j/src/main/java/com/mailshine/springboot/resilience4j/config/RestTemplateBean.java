package com.mailshine.springboot.resilience4j.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateBean {

    @Bean(value = "resilienceRestTemplate")
    public RestTemplate resilienceRestTemplate() {
        return new RestTemplate();
    }
}
