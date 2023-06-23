package com.example.tut10.controller;


import com.example.tut10.dto.CrudDto;
import com.example.tut10.mappers.CrudMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/emp")
public class CrudController {

//1. 리다이렉션 방식
//    private CrudMapper crudMapper;
//
//    @Autowired(생성자방식)
//    public CrudController(CrudMapper crudMapper) {
//        this.crudMapper = crudMapper;
//    }
//
////    select
//    @GetMapping("/list")
//    public String getList(Model model) {
//        model.addAttribute("emp", crudMapper.getEmpAll());
//        return "admin/empList";
//    }
//
////    getmapping은 화면에 출력
//    @GetMapping("/insert")
//    public String getInsert() {
//        return "admin/empInsert";
//    }
//
////    post방식을 쓸때 PostMapping을 사용 : 보안차이 post:url에 안보여짐.
//    @PostMapping("/insert")
//    public String saveEmp(CrudDto crudDto) {
////        saveEmp(mapper사용)
//        crudMapper.saveEmp(crudDto);
//    //페이지입력 로딩 해라는 뜻
//        return "redirect:/emp/list";
//    }
//
////    에이젝스방식 : 보통 이방식으로 사용함.
////    @GetMapping("/delete")
//////    입력값을받을때 delete 값 empId가 pk라서(보통)
////    @ResponseBody
////    public void deleteEmp(int empId) {
////        System.out.println(empId);
////        crudMapper.deleteEmp(empId);
////    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteEmp(@PathVariable int id) {
//        System.out.println(id);
//        crudMapper.deleteEmp(id);
//        return "redirect:/emp/list";
//    }


//    2.에이젝스방식 : JSON사용(map사용:예외처리하기 위해서)

    @Autowired
    private CrudMapper crudMapper;

    @GetMapping("/insert")
    public String getInsert() {
        return "admin/empInsert";
    }

    @PostMapping("/insert")
    @ResponseBody
    public Map<String, Object> saveEmp(CrudDto crudDto) {

//        예외처리
//        자료가있으면 저장해주쇼.
//            성공,실패 map으로 만들기(
        Map<String, Object> map = new HashMap<>();
        if (crudDto != null) {
            crudMapper.saveEmp(crudDto);
//            Map<변수타입, 값> 이름 = new HashMap<>(); > json을 만들준비가 되었다. 데이터입력은 put임.
            map.put("msg", "success");
        } else {
            map.put("msg", "failure");
        }
        return map;
    }

    @GetMapping("/list")
    public String getList(Model model) {
        List<CrudDto> emp = crudMapper.getEmpAll();

        model.addAttribute("emp", emp);
        return  "admin/empList";
    }

    @GetMapping("/delete")
    @ResponseBody
    public Map<String, Object> deleteEmp(int empId) {
        Map<String, Object> map = new HashMap<>();

        if(empId != 0) {
            crudMapper.deleteEmp((empId));
            map.put("msg","success");
        }else {
            map.put("msg", "failure");
        }
        crudMapper.deleteEmp(empId);
        return map;
    }

    @GetMapping("/view/{id}")
    public String getView(@PathVariable int id, Model model) {
        CrudDto crudDto = crudMapper.getEmpOne(id);
        model.addAttribute("emp", crudDto);
        return "admin/empView";
    }


    @GetMapping("/update/{id}")
        public String getUpdate(@PathVariable int id, Model model){
            CrudDto crudDto = crudMapper.getEmpOne(id);
            model.addAttribute("emp", crudDto);
        return "admin/empUpdate";
        }

    @PostMapping ("/update")
    @ResponseBody
    public Map<String, Object> updateEmp(@ModelAttribute CrudDto crudDto) {
        Map<String, Object> map = new HashMap<>();
        if(crudDto != null) {
            map.put("message", "yes");
            crudMapper.updateEmp(crudDto);
        }else {
            map.put("message", "no");
        }

        return map;
    }

}