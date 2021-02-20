package com.itfm.controller;

/**
 * @ProjectName: spring-boot-01-helloworld
 * @Package: com.icbc.controller
 * @ClassName: HelloController
 * @Author: ICBC
 * @Description: 控制层
 * @Date: 2021/2/17 20:21
 * @Version: 1.0
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description 这个一个控制层层
 * @Author frankman
 * @Date 2021/2/17 20:21
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
    @ResponseBody
    @RequestMapping("/helloss")
    public String Helloss(){
        return  "helloss";
    }

}
