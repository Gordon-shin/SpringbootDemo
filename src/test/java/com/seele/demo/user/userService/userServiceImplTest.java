package com.seele.demo.user.userService;

import com.seele.demo.user.userEntity.User;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class userServiceImplTest {
    static Logger logger = Logger.getLogger(userServiceImplTest.class) ;
    @Autowired
    userServiceImpl userService;
    @Test
    void getAllInfo() {
        List<Map<String,Object>> map = userService.getAllInfo();
        System.out.println(map);
    }
}