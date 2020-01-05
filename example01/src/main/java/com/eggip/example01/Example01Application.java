package com.eggip.example01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Example01Application {

    public static void main(String[] args) {
        SpringApplication.run(Example01Application.class, args);
    }

    @GetMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        return "hello";
    }

}
