package com.flamexander.cloud.front.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FontRestTemplate {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    private RestTemplate restTemplate=new RestTemplate();
}
