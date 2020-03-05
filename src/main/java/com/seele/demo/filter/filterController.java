package com.seele.demo.filter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class filterController {

    @RequestMapping(value = "/failed",method = RequestMethod.GET)
    public Map<String,String> Requestfailed(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("code", "-1");
        map.put("msg", "请求错误");
        return map;
    }
}
