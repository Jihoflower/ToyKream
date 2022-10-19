package com.toykream.service.user;

import com.toykream.dto.user.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class UserService {

    @Autowired
    private com.toykream.mapper.user.UserMapper userMapper;
    public void createMember(UserDTO user){
        System.out.println(user.getUserEmail() + user.getUserPassword());
        userMapper.createMember(user);
    }

    public UserDTO selectOne(UserDTO logIn){
        UserDTO test = userMapper.selectOne(logIn);
        return test;
    }

}
