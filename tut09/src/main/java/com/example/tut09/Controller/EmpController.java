package com.example.tut09.Controller;


import com.example.tut09.dto.BuseoDto;
import com.example.tut09.dto.EmpDto;
import com.example.tut09.mappers.BuseoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private BuseoMapper buseoMapper;

//    select > 저장 responsebody
    @GetMapping("/dept")
    @ResponseBody
    public List<BuseoDto> getDept() {
        return buseoMapper.getEmpAjax();
    }

    @GetMapping("/register")
    public String getRegister() {
        return "register";
    }


    //    insert > 저장아니니까 resoponsebody할필요없음.
    @PostMapping("/register")
    public String saveEmp(EmpDto empDto) {
        buseoMapper.saveEmp(empDto);
        return "redirect:/emp/empList";
    }

    @GetMapping("/empList")
    public String getList(Model model) {
        model.addAttribute("employees",buseoMapper.getEmpAll());
        return "admin/empList";
    }

    @GetMapping("/delete/{id}")
    public String deleteMemEmp(@PathVariable int id) {
        return "redirect:/emp/empList";
    }

    @GetMapping("/edit/{id}")
    public String getEditPage(@PathVariable int id, Model model) {
        EmpDto getOne = buseoMapper.getEmpOne(id);
        model.addAttribute("person",getOne);
        return "edit";
    }
}