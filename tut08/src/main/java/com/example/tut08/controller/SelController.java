package com.example.tut08.controller;


import com.example.tut08.dto.BuseoDto;
import com.example.tut08.dto.PosDto;
import com.example.tut08.mappers.SelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class SelController {

    //    누구꺼 쓸껀데?  new 대신 쓰는것:Autowired 불릴이름을 selMapper controller와 mapper이 연결됨.
    @Autowired
    private SelMapper selMapper;

    @GetMapping("/register")
    public String getRegisterPage() {
        return "main/register.html";
    }

    //    ajax방식으로 쓸때
    @PostMapping("/register")
    @ResponseBody
    public List<BuseoDto> getAjaxDo() {
        return selMapper.getBuseo();
    }

    @PostMapping("/getPos")
    @ResponseBody
    public List<PosDto> getPosValue(String selectValue) {
        return selMapper.getPos(selectValue);
    }
}