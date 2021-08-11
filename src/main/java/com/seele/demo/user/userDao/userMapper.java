package com.seele.demo.user.userDao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seele.demo.user.userEntity.User;

import java.util.List;
import java.util.Map;

@Mapper
@Repository(value = "userMapper")
public interface userMapper {

   List<Map<String,Object>>getUsers();
   User getUserById(int id);
   int insertUser(User user);
   //Mpa<String,Object>
}
