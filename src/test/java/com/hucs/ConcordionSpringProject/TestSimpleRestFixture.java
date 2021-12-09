package com.hucs.ConcordionSpringProject;

public class TestSimpleRestFixture extends DefaultFixture{

    public String call() {
        return restTemplate.getForObject("http://localhost:8080/version",String.class);
    }

}

