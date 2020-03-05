package com.seele.demo.config;

import org.springframework.beans.factory.annotation.Autowired;

public class ConfigTest {
    @Autowired
    seeleConfig seeleConfig;

    public String getConfig(){
        return  seeleConfig.toString();
    }
}
