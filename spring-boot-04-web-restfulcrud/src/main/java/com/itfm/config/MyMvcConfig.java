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

import com.itfm.component.LoginHandlerInterceptor;
import com.itfm.component.MyLocaleResolver;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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

    //所有的webmvcconfigAdapter组件都会一起起作用
    //替换helloController类中的index方法，访问index.html页面
    @Bean //组件注册在容器中，才能生效
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            //内部类里实现 ctrl + O 实现试图映射
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
//                super.addViewControllers(registry);
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
                //shift + F6修改文件名称
            }

            //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //super.addInterceptors(registry);
                //静态资源；  *.css , *.js
                //SpringBoot已经做好了静态资源映射
               /* registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html","/","/user/login");*/
               //测试错误码，注释掉这部分，后续打开
            }
        };
        return adapter;
    }

    /**
     * 区域信息解析器生效 MyLocaleResolver这个类
     * @return
     */
    @Bean
    public LocaleResolver localeResolver(){

        return new MyLocaleResolver();
    }

    //配置嵌入式的Servlet容器
//    @Bean
//    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer(){
//        return new EmbeddedServletContainerCustomizer() {
//
//            //定制嵌入式的Servlet容器相关的规则
//            @Override
//            public void customize(ConfigurableEmbeddedServletContainer container) {
//                container.setPort(8083);
//            }
//        };
//    }
}
