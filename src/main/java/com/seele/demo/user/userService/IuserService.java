package com.seele.demo.user.userService;

import com.seele.demo.user.userEntity.User;

import java.util.List;
import java.util.Map;

public interface IuserService {
    Map<String,String>login(String username,String password);
   List<Map<String,Object>> getAllInfo();
}
