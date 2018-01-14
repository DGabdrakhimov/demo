package com.demo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGenClass {

    @RequestMapping(path = "/")
    public String homePage() {
        return "Welcome Home!!!";
    }
}
