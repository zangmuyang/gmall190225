package com.atguigu.gmall.ums.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UmsController {

    @RequestMapping("getAllUms")
    @ResponseBody
    public String getAllUms(){
        return "allUms";
    }
}
