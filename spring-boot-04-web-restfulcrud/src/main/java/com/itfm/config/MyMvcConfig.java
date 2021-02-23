package com.itfm.config;

/**
 * @ProjectName: spring-boot-04-web-restfulcrud
 * @Package: com.itfm.config
 * @ClassName: MyMvcConfig
 * @Author: frankman
 * @Description: 配置类
 * @Date: 2021/2/23 21:39
 * @Version: 1.0
 */

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/2/23 21:39
 */
//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能 扩展springmvc的功能
//@EnableWebMvc   //全面接管springmvc的配置，控制台打印没有，如果不全面接管，控制台会打印一些数据
// 全面接管后，静态页面都无法访问了 springboot对我们的所有自动配置都失效了
// 不要接管SpringMVC 全部自己配置
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    //ctrl + O 打开方法可以重写

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        //浏览器发送 /itfm 请求来到success界面
        registry.addViewController("/itfm").setViewName("success");
    }
}
