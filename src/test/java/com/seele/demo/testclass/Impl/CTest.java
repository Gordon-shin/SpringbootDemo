package com.seele.demo.testclass.Impl;

import com.seele.demo.testclass.C;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CTest {

    @Test
    public void testTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext();
        //(CTest1)ac.getBean("");
    }

}