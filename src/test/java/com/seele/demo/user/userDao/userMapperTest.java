package com.seele.demo.user.userDao;

import com.seele.demo.user.userEntity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class userMapperTest {
@Autowired
userMapper userMapper;
    @Test
    void getUsers() {
    }

    @Test
    void getUserById() {
        System.out.println(userMapper.getUserById(1));
    }

    @Test
    void insertUser() {
        userMapper.insertUser(new User("dog","dog"));
    }
}