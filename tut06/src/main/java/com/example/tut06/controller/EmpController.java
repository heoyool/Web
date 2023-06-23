package com.example.tut06.controller;

import com.example.tut06.dto.DeptDto;
import com.example.tut06.dto.RegDto;
import com.example.tut06.mappers.EmpMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
///employees/이 중복되니까
@RequestMapping("/employees")
public class EmpController {

    //    mapper
    @Autowired EmpMappers empMappers;

//    register 화면띄울때 주소는 /employees/register이걸 쓸거야.
    @GetMapping("/register")
    public String getRegisterHtml() {
//        그럼 /employees/register가 어디있느냐라는 뜻 > emp폴더안에 register.html에있다.
        return "emp/register.html";
    }

    @PostMapping("/register")
    public String getRegister(RegDto regDto) {
//        System.out.println(regDto.getDept());
//        System.out.println(regDto.getEmail());
//        System.out.println(regDto.getPasswd());

        empMappers.saveEmp(regDto);
        return "redirect:/employees/list";
    }
//    list 화면띄울때 /employees/list를 사용할거야.
    @GetMapping("/list")
    public String getListHtml(Model model) {
//        String msg = "Koreait 사원목록 페이지";
//        model.addAttribute("retitle",msg);

//        1번째 방법
//        System.out.println(empMappers.getEmpAll());
        model.addAttribute("emp", empMappers.getEmpAll());

//        2번째 방법
//        List<RegDto> emp = empMappers.getEmpAll();
//        model.addAttribute("emp",val);
        return "admin/list.html";
    }

    //ajax에서 가져올 주소
    @GetMapping("/dept")
    @ResponseBody
    public List<DeptDto> getDept() {
        return empMappers.getDept();
    }

    @GetMapping("/delete/{email}")
    public String deleteEmp(@PathVariable String email) {
        empMappers.deleteEmp(email);
        return "redirect:/employees/list";
    }
}