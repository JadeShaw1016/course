package com.example.course.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String testSpringBoot() {

        return "Hello,Welcome!";
    }
}

