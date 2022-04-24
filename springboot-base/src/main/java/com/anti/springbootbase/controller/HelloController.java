package com.anti.springbootbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("host","Index") ;
        return "index";
    }
}
