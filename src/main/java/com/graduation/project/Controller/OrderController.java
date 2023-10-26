package com.graduation.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/order")
public class OrderController {
@RequestMapping("/checkout")
    public String checkout(){
    return "user/order/checkout";
}

    @RequestMapping("/list")
    public String list(){
        return "user/order/list";
    }

    @RequestMapping("/detail/{id}")
    public String detail(){
        return "user/order/detail";
    }

}
