package com.wangyq.config;

import com.wangyq.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration  指明这个类为配置类，用来替代之前的spring配置文件
 *
 * 在配置文件中使用bean标签添加组件
 */
@Configuration
public class MyAppConfig {

    //将方法返回值添加到容器中，容器中的这个组件id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("添加helloService到组件中");
        return new HelloService();
    }
}
