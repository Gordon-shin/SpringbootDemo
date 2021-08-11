package com.seele.demo.testclass.Impl;

import java.util.concurrent.atomic.AtomicBoolean;

public class valuePassTest {
    public static void main(String[] args) {
        AtomicBoolean age = new AtomicBoolean(false);
        modify(age);
        System.out.println(age);
        if (age.get()){
            System.out.println(1111);
        }
    }

    private static void modify(AtomicBoolean age1) {
        age1.set(true); ;
    }

}
