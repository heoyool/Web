package com.example.tut00.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//1. @Controller 붙이기
    // 이거 붙이는 순간 로그인 창관리  > 임포트
    @Controller
    // @RequestMapping : 페이지 마다 공통적으로 사용할 주소
    //원래는@RequestMapping("/member")로 써야하는데 위에 requestMapping 했기에
    // member생략가능. 앞으로 사용할거에도 member생략가능
    @RequestMapping("/member")
    public class loginController {

//2. 주소입력하면 html 로그인창띄우기
    //(1)메소드 만들기 : 주소관리할 메소드 생성
    //    public String 이름() { return "";}
    //(2) 사용할 주소 메소드 위에 입력 @GetMapping(); > 임포트
    //  주소안에는 "", /, ;안붙여야함
    @GetMapping("/login")
    @ResponseBody //(Json언어로 변경)
    public String loginView() {
        //Json 객체 데이터 출력 : Spring > FrontEnd 전송(자바스크립트로 전송)
        //글자처럼 보이지만 Json 객체임
        return "Welcome Home";
    }
    }

