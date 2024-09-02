package com.itheima.Mapper;


import com.itheima.pojo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    User selectUser(String username);

}
