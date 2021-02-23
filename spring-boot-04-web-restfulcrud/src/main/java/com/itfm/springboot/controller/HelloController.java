package com.itfm.springboot.controller;

/**
 * @ProjectName: spring-boot-04-web-restfulcrud
 * @Package: com.itfm.springboot.controller
 * @ClassName: HelloController
 * @Author: frankman
 * @Description: 控制类
 * @Date: 2021/2/23 15:24
 * @Version: 1.0
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/2/23 15:24
 */
@RestController
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world ";
    }
}
