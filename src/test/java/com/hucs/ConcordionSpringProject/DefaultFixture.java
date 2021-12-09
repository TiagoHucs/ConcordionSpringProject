package com.hucs.ConcordionSpringProject;

import org.concordion.api.AfterSpecification;
import org.concordion.api.BeforeSpecification;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

@RunWith(ConcordionRunner.class)
public abstract class DefaultFixture {

    ConfigurableApplicationContext context;
    RestTemplate restTemplate;

    @BeforeSpecification
    public void beforeAll(){
        String[] args = new String[0];
        context = SpringApplication.run(MyApplication.class, args);
        restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
    }

    @AfterSpecification
    public void afterAll(){
        context.close();
    }
}
