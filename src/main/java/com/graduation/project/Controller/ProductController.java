package com.graduation.project.Controller;

import com.graduation.project.Model.Product;
import com.graduation.project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user/product")
public class ProductController {
    @Autowired
    ProductService productService;
@RequestMapping("/list")
    public String list(Model model , @RequestParam("cid") Optional<String> cid){
    if (cid.orElse("").isEmpty()) {
    List<Product> list = productService.findAll();
    model.addAttribute("items",list);
    } else {
        List<Product> list = productService.findByCategoryId(cid.get());
        model.addAttribute("items", list);
    }
    return "user/product/list";
}
    @RequestMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Product item = productService.findById(id);
        model.addAttribute("item", item);
        return "user/product/detail";
    }
    @RequestMapping("/comment")
    public String comment(){
        return "user/product/comment";
    }
}


