package com.graduation.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/layout")
public class StoreController {
    @RequestMapping("/index")
    public String index(){
        return "user/layout/index";
    }

}

