package com.seele.demo.testclass.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CTest1 {
    @Resource(name = "C")
    private com.seele.demo.testclass.A a;


}
