/*
 * Project: demo
 * 
 * File Created at 2014-10-30
 
 * Copyright 2014 ANTEAM-INC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ANTEAM Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with ANTEAM-INC.
 */
package com.demo.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试类
 *
 * @author bash
 * @version V1.0
 * @since 2014-10-30 21:28
 */
@Controller
@RequestMapping("/home")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHello(ModelMap map) {
        System.out.println("say Hello ……");
        map.addAttribute("name", " World!");
        return "/hello";
    }

    @RequestMapping("/index")
    public String sayHi(ModelMap map) {
        System.out.println("say hi ……");
        map.put("name", "index");
        return "/index";
    }
}