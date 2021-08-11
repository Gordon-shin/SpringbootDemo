package com.seele.demo.testclass.Impl;

import org.springframework.stereotype.Component;

@Component("A")
public class A implements com.seele.demo.testclass.A {
    @Override
    public void doa() {
        System.out.println("A");
    }
}
