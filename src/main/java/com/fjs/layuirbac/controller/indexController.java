package com.fjs.layuirbac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping(value="/")
    public String index(){

        return "index";

    }

    //path代表很多模块
    @GetMapping(value="to/{path}")
    public String to(@PathVariable String path){
        return path+"/index";

    }
}
