package com.example.tut05.cotroller;
import com.example.tut05.dto.AdminDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//관리자는 이거 그다음으로 적어야함
@RequestMapping("/admin")
public class Adamincontroller {
    @GetMapping("")
    public String getAdminMainPage(Model model) {
//        생성자를 이용해서 필드에 값주입
        AdminDto adminDto = new AdminDto("사원관리목록보기", "1. koreait로그인페이지");
        model.addAttribute("adminDto", adminDto);
        return "admin/admin.html";
    }
}
//
//    @GetMapping("/admin")
//    public String getAdminMainPage(Model model) {
//        String getTitle = "코리아아이티 관리자 페이지 입니다.";
//        model.addAttribute("abd",getTitle);
//        return "admin/admin.html";
//    }
//}
