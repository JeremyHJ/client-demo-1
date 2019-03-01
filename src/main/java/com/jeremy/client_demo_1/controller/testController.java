package com.jeremy.client_demo_1.controller;/**
 Created by 胡杰 on 2019/3/1. */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: com.jeremy.client_demo_1.controller.testController.java
 * Author: Jeremy_Hu
 * Date: 2019/3/1 下午10:19
 */
@RequestMapping(value="/client1")
@RestController
public class testController {

    @RequestMapping(value = "/inner/test")
    public String innerTest(){
        return "Hello world";
    }

}
