package com.msb.com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class ThymeleafController {

//    @ResponseBody
    @RequestMapping("/show")
    public String show(Map<String ,Object> map){
        map.put("msg","testMessage");
        return "index";
    }

}
