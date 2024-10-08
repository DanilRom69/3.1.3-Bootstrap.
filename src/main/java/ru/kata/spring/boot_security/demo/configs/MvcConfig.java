package ru.kata.spring.boot_security.demo.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("users/login");
        registry.addViewController("/user").setViewName("users/userPage");
        registry.addViewController("/admin").setViewName("admin/adminPage");
        registry.addViewController("/new").setViewName("admin/newUser");
    }
}
