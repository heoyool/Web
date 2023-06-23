package com.example.tut01.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/member/login")
    public String loginView() {
        return "login";
    }

    @PostMapping("/member/login")
//    @PathVariable html에 입력한 값이 userid, passwd에 저장되어 Spring 으로 넘어온값을 받아줌.
    public void loginDo(@PathVariable String userid, @PathVariable String passwd) {
        System.out.println("아이디 : " + userid + ", 비밀번호 : " + passwd);
    }
}
