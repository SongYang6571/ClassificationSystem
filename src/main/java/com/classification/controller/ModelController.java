package com.classification.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {
    @RequestMapping("/modelShow")
    public String getModelShow(){
        return "modelShow";
    }
}
