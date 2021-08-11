package com.seele.demo.testclass.Impl;

import com.seele.demo.testclass.A;
import com.seele.demo.testclass.B;
import org.springframework.stereotype.Component;

@Component("C")
public class C implements A, B {
    @Override
    public void doa() {

    }

    @Override
    public void dob() {

    }
}
