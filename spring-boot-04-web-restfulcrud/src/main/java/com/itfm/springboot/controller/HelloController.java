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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/2/23 15:24
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld() {
        return "hello world ";
    }

    // 查询出来数据在页面会展示
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        //classpath:/templates/success.   success.html文件
        map.put("hello", "你好");
        return "success";
    }
}
