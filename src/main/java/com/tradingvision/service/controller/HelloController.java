package com.tradingvision.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luodejin on 2018/8/8.
 */
@RestController
@RequestMapping("/bigdata")
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello() {
        System.out.println("进入controller");
        return "Hello World!";
    }
}
