package com.gsenc.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gsenc")
public class CustomApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomApiApplication.class, args);
    }

}
