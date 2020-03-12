package com.seele.demo.user.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.seele.demo.user.userDao.userMapper;
import com.seele.demo.user.userEntity.User;

import java.util.List;
import java.util.Map;

@Service
public class userServiceImpl implements IuserService {
    @Autowired
    userMapper userMapper;
    @Override
    public Map<String, String> login(String username, String password) {
        return null;
    }

    @Override
    public List<User> getAllInfo() {
        return userMapper.getUsers();
    }
}
