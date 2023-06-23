package com.example.tut05.cotroller;


import com.example.tut05.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class userscontroller {

    @GetMapping("")
    public String getLoginPage(Model model) {
//        String title = "사용자페이지입니다.";
//        String heading = "로그인페이지";
//        model.addAttribute("t", title);
//        model.addAttribute("h",heading);

//        userDto title 관련
////        1. dto 폴더 필드(title)생성 > g,s만들기
////        2. 다음문장 만들기
//          3. 객체생성
//        UserDto userDto = new UserDto();
//        userDto.setTitle("로그인페이지");
//        model.addAttribute("l", userDto);

//        userDto title, heading 관련
          UserDto userDto = new UserDto();
          userDto.setTitle("코리아아이티아카데미");
          userDto.setHeading("로그인페이지");
          model.addAttribute("userDto",userDto);

        return "users/login.html";
    }
}
