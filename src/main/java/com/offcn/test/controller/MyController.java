package com.offcn.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "test1";
    }
    @GetMapping("/index1")
    public String index(){
        System.out.println("contrller");
        return "index";
    }
}
