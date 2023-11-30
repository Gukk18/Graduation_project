package com.graduation.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SecurityController {
    @RequestMapping("/user/security/login/form")
    public String loginForm(Model model){
        model.addAttribute("message","Please login !");
        return "user/security/login";
    }
    @RequestMapping("/user/security/login/success")
    public String loginSuccess(Model model){
        model.addAttribute("message","Login Successfully !");
        return "user/security/login";
    }

    @RequestMapping("/security/login/error")
    public String loginError(Model model) {
        model.addAttribute("message", "Sai thông tin đăng nhập!");
        return "user/security/login";
    }

    @RequestMapping("/security/unauthoried")
    public String unauthoried(Model model) {
        model.addAttribute("message", "Không có quyền truy xuất!");
        return "user/security/login";
    }

    @RequestMapping("/security/logoff/success")
    public String logoffSuccess(Model model) {
        model.addAttribute("message", "Bạn đã đăng xuất!");
        return "user/security/login";
    }

}
