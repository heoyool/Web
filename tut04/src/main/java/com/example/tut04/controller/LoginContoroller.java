package com.example.tut04.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class LoginContoroller {
//    controller만 쓸때는 (필드, 생성자, g), 메소드 필요하지만. 세개생략가능
//    Rest Api : html 출력 x > 글자나 db 자료를 전송
//    Response > json으로 출력
//    @GetMapping("/login")
//    @ResponseBody
//    public String textOutput() {
//        return "Koreait Academy";
//    }

//    html로 띄우기 :
    @GetMapping("/login")
    public String dispHtml() {
        log.info("설정에 문제 없으면 콘솔에 이 글자가 보입니다.");
        return "admin/login";
    }
}
