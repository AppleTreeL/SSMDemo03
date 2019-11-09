package com.arvin.controller;

import com.arvin.po.User;
import com.arvin.po.UserDemo;
import javafx.beans.value.ObservableStringValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2019/10/23 20:20
 * @Created by AppleTree
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/user/save", method = {RequestMethod.GET})
    public String saveUser(){

        return new Date().toString();
    }
}
