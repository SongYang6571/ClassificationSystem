package com.classification.controller;

import com.classification.dataobject.Api;
import com.classification.mapper.ApiMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class ApiSearchController {

    @Autowired
    ApiMapper apiMapper;

    @PostMapping("/search")
    public String processApiSearch(@ModelAttribute Api api, Model model){
        String label = api.getLabel();
//        System.out.println(label);
        List<Api> list = apiMapper.findByLabel(label);
        model.addAttribute("apilist",list);
        return "searchResult";
    }
}
