package com.itfm.springboot.controller;

/**
 * @ProjectName: spring-boot-02-config
 * @Package: com.itfm.springboot.controller
 * @ClassName: HelloController
 * @Author: ICBC
 * @Description: 这是控制层
 * @Date: 2021/2/22 17:48
 * @Version: 1.0
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/2/22 17:48
 */
@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @ResponseBody
    @RequestMapping(value="hello")
    public String hello(){

        return "hello"+name;

    }

}
