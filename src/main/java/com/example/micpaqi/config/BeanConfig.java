package com.example.micpaqi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

public class BeanConfig {
    @Configuration
    @ComponentScan(basePackages = {"com.example.micpaqi.config"})
    public class beanConfig {
        @Bean
        public static RestTemplate restTemplate() {
            return new RestTemplate();
        }
    }
}
