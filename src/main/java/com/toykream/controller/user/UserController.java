package com.toykream.controller.user;

import com.toykream.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }
    @PostMapping("/signup")
    public String logIn(@RequestBody Model user){
        System.out.println("logIn method on");
        userService.createMember(user);
        return "/";
    }



}
