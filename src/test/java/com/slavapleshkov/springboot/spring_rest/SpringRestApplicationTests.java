package com.slavapleshkov.springboot.spring_rest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringRestApplicationTests {

    @Test
    void contextLoads() {
    }

}
