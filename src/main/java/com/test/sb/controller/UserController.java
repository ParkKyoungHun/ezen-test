package com.test.sb.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.sb.service.UserService;
import com.test.sb.vo.User;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;
    @PostMapping("/join")
    public int join(@RequestBody User user) {
        int result = userService.createUser(user);
        return result;
    }
    @GetMapping("/users")
    public User getUser(@PathVariable("num") int num){
        return new User();
    }

    @PutMapping("/users")
    public int updateUser(@RequestBody User user){
        log.info("user=>{}", user);
        return 1;
    }
}
