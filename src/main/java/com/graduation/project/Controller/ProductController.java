package com.graduation.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/product")
public class ProductController {

@RequestMapping("/list")
    public String list(){
    return "user/product/list";
}
    @RequestMapping("/detail/{id}")
    public String detail(){
        return "user/product/detail";
    }

}
