package com.classification.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {
    @RequestMapping("/resultShow")
    public String getResult(){
        return "resultShow";
    }
}
