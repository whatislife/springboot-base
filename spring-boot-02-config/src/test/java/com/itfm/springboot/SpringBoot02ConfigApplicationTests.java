package com.itfm.springboot;

/**
 * @ProjectName: spring-boot-02-config
 * @Package: com.itfm.springboot
 * @ClassName: SpringBoot02ConfigApplicationTests
 * @Author: frankman
 * @Description: 单元测试
 * @Date: 2021/2/22 16:09
 * @Version: 1.0
 */

import com.itfm.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description TODO
 * @Author frankman
 * @Date 2021/2/22 16:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Autowired
    ApplicationContext iocs;


    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void testHelloService() {
        boolean b = ioc.containsBean("helloService3");
        System.out.println("获取helloservice："+ b);
    }

}
