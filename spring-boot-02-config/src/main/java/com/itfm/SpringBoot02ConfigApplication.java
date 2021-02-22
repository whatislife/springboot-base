package com.itfm;

/**
 * @ProjectName: spring-boot-02-config
 * @Package: com.com.itfm
 * @ClassName: SpringBoot02ConfigApplication
 * @Author: ICBC
 * @Description: 启动类
 * @Date: 2021/2/22 10:21
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/2/22 10:21
 */
//1.通过xml文件导入bean数据
//@ImportResource(locations={"classpath:beans.xml"})
//2.通过配置类的方式获取bean数据  参考config包@Bean类
@SpringBootApplication
public class SpringBoot02ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot02ConfigApplication.class, args);
    }
}
