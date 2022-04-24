package com.spring.darle.controller;

import com.spring.darle.dto.MemberDto;
import com.spring.darle.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private MemberService memberService;

//    회원가입 페이지
    @GetMapping("/join")
    public String getJoin(){
        return "join/join";
    }

    @PostMapping("/join")
    public String postJoin(MemberDto dto){
        memberService.postJoin(dto);
        return "login/login";
    }

//    로그인 페이지
    @GetMapping("/login")
    public String getLogin(){
        return "login/login";
    }
}
