package com.meichel.mavenplayground;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;

@SpringBootTest
class MavenPlaygroundApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Unit Tests are being executed."+ Instant.now());
    }

}
