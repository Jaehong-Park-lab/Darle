package com.spring.darle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

//    회원가입 페이지
    @GetMapping("/join")
    public String getJoin(){
        return "join/join";
    }

//    로그인 페이지
    @GetMapping("/login")
    public String getLogin(){
        return "login/login";
    }
}
