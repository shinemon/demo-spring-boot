package com.mailshine.spring.hystrix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateBean {

    @Bean(value = "hystrixRestTemplate")
    public RestTemplate hystrixRestTemplate() {
        return new RestTemplate();
    }
}
