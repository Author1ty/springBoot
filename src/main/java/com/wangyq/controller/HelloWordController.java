package com.wangyq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main")
public class HelloWordController {

    @RequestMapping("hello")
    public String  showHelloWord(){
        System.out.println("Hello Word!");
        return "Hello Word!";
    }
}
