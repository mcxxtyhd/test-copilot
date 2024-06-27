package com.theo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：yangchenxiao
 * @date ：Created in 2024/6/27 15:39
 * @description：
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/theo")
    public String getTest(){
        return "666";
    }

}
