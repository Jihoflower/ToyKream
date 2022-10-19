package com.toykream.mapper.user;


import com.toykream.dto.user.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
@Mapper
public interface UserMapper {
    //Model 버전
    void createMember(UserDTO user);
    UserDTO selectOne(UserDTO logIn);

}

