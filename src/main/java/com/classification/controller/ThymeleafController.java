package com.classification.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/th")
public class ThymeleafController {
    @RequestMapping(value = "/index")
    public String index(ModelMap map){
        map.addAttribute("name","yangsong");
        return "index";
    }
}
