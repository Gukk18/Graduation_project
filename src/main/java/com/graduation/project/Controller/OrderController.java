package com.graduation.project.Controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/order")
public class OrderController {


    @RequestMapping("/list")
    public String detail(Model model, HttpServletRequest request) {
//        String username = request.getRemoteUser();
//        model.addAttribute("orders", orderService.findByUsername(username));

        return "user/order/list";
    }

    @RequestMapping("/detail/{id}")
    public String detail(){
        return "user/order/detail";
    }

    @RequestMapping("/checkout")
    public String checkout(){
        return "user/order/checkout";
    }

}
