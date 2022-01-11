package com.g;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("demo");
        System.out.println("demo2");
        System.out.println("demo3");
        System.out.println("master demo3");
        System.out.println("demo3");
    }

}
