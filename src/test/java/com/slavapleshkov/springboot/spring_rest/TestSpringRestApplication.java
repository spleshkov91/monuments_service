package com.slavapleshkov.springboot.spring_rest;

import org.springframework.boot.SpringApplication;

public class TestSpringRestApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringRestApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
