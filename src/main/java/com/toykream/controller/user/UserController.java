package com.toykream.controller.user;

import com.toykream.controller.Session;
import com.toykream.dto.user.UserDTO;
import com.toykream.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    Session session;

    //회원가입 페이지 이동 및 회원가입 처리
    @GetMapping("/signup")
    public String signup(){
        return "user-regist/regist-user";
    }
    @PostMapping("/signup")
    public String registMember(UserDTO user){
        System.out.println(user);
        user.setUserPassword(convertToSha(user.getUserPassword()));
        userService.createMember(user);
        return "user-regist/login-user";
    }

    @GetMapping("/signin")
    public String logIn(){
        return "user-regist/login-user";
    }

//    회원 로그인 처리

    @PostMapping("/signin")
    public String logIn(HttpServletRequest request, UserDTO logIn){
        logIn.setUserPassword(convertToSha(logIn.getUserPassword()));
        UserDTO validate =  userService.selectOne(logIn);
        System.out.println("validate = "+validate);
        if(validate != null){
            String userRole = validate.getUserRole();
            System.out.println("userRole = "+userRole);
            switch (userRole){
                case "admin" :
                    session.settingSession(request,validate.getUserRole(),validate.getUserName(),validate.getUserPoint(),validate.getUserNum(),validate.getUserSize());
                    return "/admin/admin-index";
                case "md" :
                    session.settingSession(request,validate.getUserRole(),validate.getUserName(),validate.getUserPoint(),validate.getUserNum(),validate.getUserSize());
                    return "/md/md-index";
                case "user" :
                    session.settingSession(request,validate.getUserRole(),validate.getUserName(),validate.getUserPoint(),validate.getUserNum(),validate.getUserSize());
                    return "index";
                default: return "index";
            }
        }
        return "user-regist/login-user";
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

    //로그인 후 로그인 데이터 세션 생성


    //로그아웃
    @GetMapping("/logOut")
    public String deleteSession(){
        session.deleteSession();
        return "index";
    }



}
