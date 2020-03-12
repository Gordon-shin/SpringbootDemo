package com.seele.demo.user.userDao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seele.demo.user.userEntity.User;

import java.util.List;

@Mapper
@Repository(value = "userMapper")
public interface userMapper {

   List<User> getUsers();
}
