package com.seele.demo.testclass.Impl;

import org.springframework.stereotype.Component;

@Component("B")
public class B implements com.seele.demo.testclass.B {
    @Override
    public void dob() {
        System.out.println("b");
    }
}
