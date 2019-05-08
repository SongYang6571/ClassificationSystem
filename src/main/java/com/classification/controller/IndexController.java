package com.classification.controller;

import com.classification.dataobject.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")

    public String getIndex(ModelMap map){
        Api api = new Api();
        map.put("Api",api);
        return "index";
    }
}
