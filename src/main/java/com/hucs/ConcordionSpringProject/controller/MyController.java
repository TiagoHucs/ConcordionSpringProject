package com.hucs.ConcordionSpringProject.controller;

import com.hucs.ConcordionSpringProject.entity.Result;
import com.hucs.ConcordionSpringProject.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyService service;

    @GetMapping("version")
    public String getVersion() {
        return service.getVersion();
    }

    @GetMapping("splitNames")
    public Result splitNames(@RequestParam(required = false) String fullName) {
        return service.split(fullName);
    }

}
