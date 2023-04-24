package com.igorkohsin.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private static final String template = "Hello, %s";

    @GetMapping("/hello-world")
    @ResponseBody
    public String sayHello(String name){return "Hello World";}
}
