package com.toykream.service.user;

import com.toykream.controller.user.UserController;
import com.toykream.dto.user.UserDTO;
import com.toykream.mapper.user.UserMapper;
import junit.framework.TestCase;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/root-context.xml")
public class UserServiceTest extends TestCase {

    //객체를 가져다 쓰기 위해서는 bean 생성을 해야하므로 Autowired 를 통해 spring 에게 권한을 위임
    @Autowired
    UserService userService;

    @Autowired
    UserController userController;

    // DB 유저정보 저장
//    @org.junit.Test
    public void testCreateMember() {
        UserDTO user = new UserDTO();

        user.setUserEmail("test@test.com");
        user.setUserPassword(userController.convertToSha("test"));
        user.setUserName("유테스트");
        user.setUserAddress("address");
        user.setUserSize(1);
        user.setUserNum(1231);
        user.setUserProfile("이미지");

        userService.createMember(user);
    }

//    @Test
    public void selectOne(){
        UserDTO user = new UserDTO();
        user.setUserEmail("test@test.com");
        user.setUserPassword(userController.convertToSha("test"));

        UserDTO test =  userService.selectOne(user);
        System.out.println(test);

    }

}