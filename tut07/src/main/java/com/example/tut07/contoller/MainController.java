package com.example.tut07.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
//    html 띄울때 > @Controller,
//    ajax, json > @Controller, @ResponseBody
//    => 한줄로적을수 있음 @RestController(젤 윗줄에서 만사용가능)
//      axios, fetch(브라우저마다 차이)

    @GetMapping("/main")
    public String getMainPage() {
        return "main/index.html";
    }

    @GetMapping("/login")
    public String getAdminPage() {
        return "login/index.html";
    }
}
