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

import com.itfm.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public  String hello(@RequestParam("user") String user){
        //模拟异常，调用异常类
        if(user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "Hello World";
    }



    // 查询出来数据在页面会展示
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        //classpath:/templates/success.   success.html文件
        map.put("hello", "你好");
        return "success";
    }

    /**
     * 访问当前项目下的首页，static下的index.html页面
     * 这个方法比较麻烦，在配置类中添加试图映射，MyCOnfig中添加
     * @return
     */
//    @RequestMapping({"/", "/login.html"})
//    public String index() {
//        return "login";
//    }

}
