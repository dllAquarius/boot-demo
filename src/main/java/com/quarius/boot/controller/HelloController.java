package com.quarius.boot.controller;

import com.quarius.boot.bean.Car;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/1
 * @Description:
 */
@Slf4j
@RestController()
public class HelloController {

    @Autowired
    private Car car;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @RequestMapping("/hello22")
    public String handle1(@RequestParam("name") String name){
        log.info("hello");

        return "Hello,Springboot"+name;

    }
}
