package com.itfm.springboot.controller;

/**
 * @ProjectName: spring-boot-02-config-02
 * @Package: com.itfm.springboot.controller
 * @ClassName: HelloController
 * @Author: frankman
 * @Description: 这个一个控制类
 * @Date: 2021/2/22 22:12
 * @Version: 1.0
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/2/22 22:12
 */
@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello config ";

    }
}
