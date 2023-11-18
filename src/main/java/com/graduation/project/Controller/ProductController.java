package com.graduation.project.Controller;

import com.graduation.project.Model.Product;
import com.graduation.project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/product")
public class ProductController {
    @Autowired
    ProductService productService;
@RequestMapping("/list")
    public String list(Model model){
    List<Product> list = productService.fillAll();
    model.addAttribute("items",list);

    return "user/product/list";
}
    @RequestMapping("/detail/{id}")
    public String detail(){
        return "user/product/detail";
    }
    @RequestMapping("/comment")
    public String comment(){
        return "user/product/comment";
    }
}

