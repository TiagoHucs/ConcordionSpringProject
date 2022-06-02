package com.hucs.ConcordionSpringProject.service;

import com.hucs.ConcordionSpringProject.entity.Result;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MyService {

    public String getVersion(){
        return "42";
    }

    public Result split(String fullName) {
        Result result = new Result();
        String[] words = fullName.split(" ");
        result.setFirstName(words[0]);
        result.setLastName(words[words.length - 1]);
        return result;
    }


}
