package com.classification.controller;


import com.classification.dataobject.Api;
import com.classification.mapper.ApiMapper;
import com.classification.service.impl.ApiServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import static java.lang.System.out;

@Controller
public class FindAllController {
    @Autowired
    private ApiMapper apiMapper;

    @RequestMapping("/findAll")
    public String getAllApi(Model model , @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum, ModelMap map){
//        out.println(pageNum);
        PageHelper.startPage(pageNum,1000);
        List<Api> list = apiMapper.findAll();
        PageInfo<Api> pageInfo = new PageInfo<Api>(list);
//        out.println(pageInfo.getPages());
//        out.println((pageInfo.getTotal()));
        model.addAttribute("pageInfo",pageInfo);
        Api api = new Api();
        map.put("Api",api);
        return "apiList";
    }
}
