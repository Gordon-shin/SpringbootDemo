package com.seele.demo.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class seeleConfigTest {
    @Autowired
    seeleConfig seeleConfig;

    @Test
    void testToString() {
        System.out.println(seeleConfig.toString());
    }
}