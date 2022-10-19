package com.toykream.controller.user;

import com.toykream.dto.user.UserDTO;
import com.toykream.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    //회원가입 페이지 이동 및 회원가입 처리
    @GetMapping("/signup")
    public String signup(){
        return "regist-user";
    }
    @PostMapping("/signup")
    public String registMember(UserDTO user){
        System.out.println(user);
        user.setUserPassword(convertToSha(user.getUserPassword()));
        userService.createMember(user);
        return "login-user";
    }

    @GetMapping("/signin")
    public String logIn(){
        return "login-user";
    }

//    회원 로그인 처리
    @PostMapping("/signin")
    public String logIn(UserDTO logIn){
        logIn.setUserPassword(convertToSha(logIn.getUserPassword()));
        UserDTO validate =  userService.selectOne(logIn);
        if(validate != null){
            return "index";
        }
        return "login-user";
    }




    //비밀번호 암호화
    public String convertToSha(String password){
        String converted = null;
        StringBuilder builder = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes("UTF-8"));
            builder = new StringBuilder();
            for(int i  = 0 ; i < hash.length; i++){
                builder.append(String.format("%02x",255 & hash[i]));
                // -> 절댓값으로 바꾸는 과정
            }
            converted = builder.toString();

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return converted;

    }



}
