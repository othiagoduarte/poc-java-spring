package com.othiagoduarte.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.othiagoduarte")
public class Application {

    public static void main(String[] args) {
        var app = SpringApplication.run(Application.class, args);
        for (String name :  app.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
