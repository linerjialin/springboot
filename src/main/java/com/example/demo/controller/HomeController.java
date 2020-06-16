package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 可能是条淡水鱼ゆ on 2020/6/16.
 */

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
