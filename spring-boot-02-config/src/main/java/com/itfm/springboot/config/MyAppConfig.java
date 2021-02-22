package com.itfm.springboot.config;

/**
 * @ProjectName: spring-boot-02-config
 * @Package: com.itfm.springboot.config
 * @ClassName: MyAppConfig
 * @Author: frankman
 * @Description: 这是一个配置类
 * @Date: 2021/2/22 17:34
 * @Version: 1.0
 */

import com.itfm.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/2/22 17:34
 */
@Configuration
public class MyAppConfig {

    //通过配置类的方式给容器添加组件，方法名就是ID
    //替换@ImportResource(locations={"classpath:beans.xml"})
    @Bean
    public HelloService helloService3() {
        System.out.println("通过@Bean给容器添加组件.....");
        return new HelloService();
    }
}
