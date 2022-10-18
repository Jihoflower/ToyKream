package com.toykream.mapper.user;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.ui.Model;

@Mapper
public interface UserMapper {
    //Model 버전
    void createMember(Model user);

}

