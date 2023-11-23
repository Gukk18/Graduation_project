package com.graduation.project.Interceptor;


import com.graduation.project.Service.CategoryService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



@Component
public class GlobalInterceptor implements HandlerInterceptor {
    @Autowired
    CategoryService categoryService;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        request.setAttribute("cates",categoryService.findAll());
//        if (request.getHeader("X-Requested-With") == null) {
//            request.setAttribute("cates", categoryService.findAll());
//        }
    }
}
