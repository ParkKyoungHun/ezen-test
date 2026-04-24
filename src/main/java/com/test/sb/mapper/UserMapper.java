package com.test.sb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.sb.vo.User;

@Mapper
public interface UserMapper {
    User selectUser(int num);
    List<User> selectUserList();
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int num);
}
