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
}
