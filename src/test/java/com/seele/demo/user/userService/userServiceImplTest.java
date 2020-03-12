package com.seele.demo.user.userService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class userServiceImplTest {

    @Autowired
    userServiceImpl userService;
    @Test
    void getAllInfo() {
        userService.getAllInfo();
    }
}