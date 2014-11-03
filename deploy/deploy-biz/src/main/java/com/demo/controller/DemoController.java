/*
 * Project: demo-root
 * 
 * File Created at 2014-10-31
 
 * Copyright 2014 ANTEAM-INC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Anteam_INC Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with ANTEAM-INC.
 */
package com.demo.controller;

import com.demo.model.bo.DemoBO;
import com.demo.service.share.DemoService;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * DemoController
 *
 * @author bash
 * @version V1.0
 * @since 2014-10-31 14:30
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert() {
        return "/demo/edit";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@ModelAttribute("demo") DemoBO demoBO, @RequestParam("demo.name") String name, ModelMap mm) {
        Date now = new Date();
        demoBO.setBirthday(now);
        demoBO.setName(name);
        demoBO.setGmtCreated(now);
        demoBO.setGmtModified(now);
        demoBO.setIsDelete(false);
        demoBO.setId(demoService.insert(demoBO));
        mm.put("demo", demoBO);
        return "/demo/edit";
    }

    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public String item(@RequestParam("id") Long id, ModelMap mm) {
        DemoBO demoBO = demoService.selectByPrimaryKey(id);
        mm.put("demo", demoBO);
        return "/demo/edit";
    }
}
