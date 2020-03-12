package com.seele.demo.user.userService;

import com.seele.demo.user.userEntity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class userServiceImplTest {

    @Autowired
    userServiceImpl userService;
    @Test
    void getAllInfo() {
        List<User> list =userService.getAllInfo();
        for (User item:
             list) {
            System.out.println(item.getUsername());
            System.out.println(item.getId());
        }
    }
}