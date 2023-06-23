package com.example.demo.emailCheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailController {
    @Autowired
    private EmailMapper emailMapper;
    @GetMapping("/")
    public String getForm() {
        return "register";
    }

    @PostMapping("/emailCheck")
    @ResponseBody
    public int getEmailCheck(@RequestParam String emailValue) {
        System.out.println(emailValue);
        emailMapper.getEmailCheck(emailValue);
        int result = emailMapper.getEmailCheck(emailValue);
        return result;
    }
}
