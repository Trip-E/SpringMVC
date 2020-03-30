package com.xinghe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xinghe
 * @date 2020/3/30 20:53
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String sayhello(){
        System.out.println("Hello SpringMVC!!!");
        return "success";
    }
}
