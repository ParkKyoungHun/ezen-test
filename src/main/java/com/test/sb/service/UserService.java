package com.test.sb.service;

import org.springframework.stereotype.Service;

import com.test.sb.mapper.UserMapper;
import com.test.sb.vo.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;
    
    public int createUser(User user){
        return mapper.insertUser(user);
    }
}
