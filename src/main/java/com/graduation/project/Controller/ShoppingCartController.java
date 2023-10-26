package com.graduation.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/cart")
public class ShoppingCartController {
@RequestMapping("/view")
    public String view(){
    return "user/cart/view";
}

}
