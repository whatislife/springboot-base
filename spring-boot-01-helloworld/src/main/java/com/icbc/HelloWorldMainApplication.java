package com.icbc;

/**
 * @ProjectName: spring-boot-01-helloworld
 * @Package: com.icbc
 * @ClassName: HelloWorldMainApplication
 * @Author: ICBC
 * @Description: springboot工程
 * @Date: 2021/2/17 20:17
 * @Version: 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description 来标注这是一个主程序，说明这是一个spring Boot应用
 * @Author frankman
 * @Date 2021/2/17 20:17
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
        
    }
}
