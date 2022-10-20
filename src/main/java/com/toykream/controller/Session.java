package com.toykream.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
public class Session {

    HttpSession savedSession;




    public void settingSession(HttpServletRequest request,String userRole,String userName,int userPoint,int userNum,int userSize){
        HttpSession session;
        session = request.getSession();
        session.setAttribute("userRole",userRole);
        session.setAttribute("userName",userName);
        session.setAttribute("userPoint",userPoint);
        session.setAttribute("userNum",userNum);
        session.setAttribute("userSize",userSize);
        this.savedSession = session;
    }


    public HttpSession deleteSession(){
        savedSession.invalidate();
        return savedSession;
    }



}
