package com.toykream.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class UserService {

    @Autowired
    private com.toykream.mapper.user.UserMapper userMapper;
    public void createMember(Model user){
        System.out.println("userService - createMember on");
        userMapper.createMember(user);
    }
}
