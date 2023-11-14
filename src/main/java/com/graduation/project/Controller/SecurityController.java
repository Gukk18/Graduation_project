package com.graduation.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/security")
public class SecurityController {
    @RequestMapping("/login")
    public String login(){

        return "user/security/login";
    }
    @RequestMapping("/signin")
    public String signin(){

        return "user/security/signin";
    }
    @RequestMapping("/profile")
    public String profile(){

        return "user/security/profile";
    }
}
