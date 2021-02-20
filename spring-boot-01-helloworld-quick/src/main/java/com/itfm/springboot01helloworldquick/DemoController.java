package com.itfm.springboot01helloworldquick;

/**
 * @ProjectName: spring-boot-01-helloworld-quick
 * @Package: com.icbc.springboot01helloworldquick
 * @ClassName: DemoController
 * @Author: ICBC
 * @Description: 快速向导生成代码
 * @Date: 2021/2/17 21:59
 * @Version: 1.0
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/2/17 21:59
 */
@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello quick !";

    }
}
