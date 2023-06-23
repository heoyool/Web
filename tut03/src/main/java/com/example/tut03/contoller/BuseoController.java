package com.example.tut03.contoller;


import com.example.tut03.dto.BuseoDto;
import com.example.tut03.mappers.BuseoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//주소관리하는 곳 : Controller
public class BuseoController {
    @Autowired
    private BuseoMapper buseoMapper;

    //html 화면 출력 > 주소와 메소드가 필요함. (화면관리 :
    // /localhost:8787 / 우리가 넣을 주소 : register
    @GetMapping("/register")
    //    메소드필요함
    public String getAjaxData() {
        return "register/ajax"; //html이 있는 => (폴더이름)/파일 이름
    }
    //db > select 데이터를 전송
    @PostMapping("/getBuseoAjax")
    //    데이터만 보내주는거
    @ResponseBody
    public List<BuseoDto> sendAjaxData() {
        return buseoMapper.getBuseoData();
    }
}
