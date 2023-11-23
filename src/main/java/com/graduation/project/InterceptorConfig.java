package com.graduation.project;

import com.graduation.project.Interceptor.GlobalInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    GlobalInterceptor gI;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(gI)
        .addPathPatterns("/**")
        .excludePathPatterns("/rest/**","/admin/**","/assets/**");
    }
}
