package com.piachimov.githubactiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/demo")
public class GithubActionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionDemoApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
