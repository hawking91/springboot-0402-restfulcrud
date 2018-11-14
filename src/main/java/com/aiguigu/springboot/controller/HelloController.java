package com.aiguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;
import java.util.zip.DataFormatException;

@Controller
public class HelloController {

   /* @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }*/

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello 11月7日";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h3>哈喽<h3>");
        map.put("users", Arrays.asList("刘备","关羽","张飞"));

        return "success";
    }
}
