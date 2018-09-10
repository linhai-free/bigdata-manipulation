package com.tradingvision.service.controller;

/**
 * Created by luodejin on 17/2/7.
 */
import com.tradingvision.service.model.User;
import com.tradingvision.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bigdata")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectUserById")
    public User selectUserById(@RequestParam(name = "id")int id){
        return userService.selectUserById(id);
    }

}