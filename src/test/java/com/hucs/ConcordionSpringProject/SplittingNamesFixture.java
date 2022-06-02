package com.hucs.ConcordionSpringProject;

import com.hucs.ConcordionSpringProject.entity.Result;

public class SplittingNamesFixture extends DefaultFixture{

    public Result split(String fullName) {
        Result result = restTemplate.getForObject("http://localhost:8080/splitNames?fullName="+fullName, Result.class);
        return result;
    }


}

