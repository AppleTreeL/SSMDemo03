package com.arvin.controller;

import com.arvin.po.User;
import com.arvin.po.UserDemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2019/10/23 20:20
 * @Created by AppleTree
 */
//@Controller
public class TestController {
    //@RequestMapping("/user/save")
    public Object saveUser(@RequestBody UserDemo user){
        HashMap<String, UserDemo> params = new HashMap<>();
        params.put("user", user);
        System.out.println(params.get("user"));
        return params;
    }
}
