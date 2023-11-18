package com.graduation.project.Controller;


import com.graduation.project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user/layout")
public class StoreController {
    @Autowired
    ProductService productService;
    @RequestMapping("/index")
    public String index(){
        return "user/layout/index";
    }

}

