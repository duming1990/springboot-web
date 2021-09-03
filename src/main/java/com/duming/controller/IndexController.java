package com.duming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

//在templates目录下的所有页面，只能通过Controller来跳转
//这个需要模板引擎的支持！ thymeleaf
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg", "<h1>测试</h1>");
        model.addAttribute("users", Arrays.asList("duming","mingsheng"));
        return "test";
    }
}
