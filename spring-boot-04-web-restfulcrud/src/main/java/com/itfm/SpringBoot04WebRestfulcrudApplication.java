package com.itfm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringBoot04WebRestfulcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot04WebRestfulcrudApplication.class, args);
    }

    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }
    // 自定义一个试图解析器
    private static class MyViewResolver implements ViewResolver{
        //alt + enter 提示未实现的方法

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
    //验证是否生效  ctrl +Ｇ　输入行号，跳转到多少行　
    // 搜索DispatcherServlet类 找到 doDispatch 方法进行断点，查看viewResolver 能看到咱们自定义的MyViewResolver


}
