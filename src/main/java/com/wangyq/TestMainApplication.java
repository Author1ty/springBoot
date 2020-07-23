package com.wangyq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//使用MyAppConfig代替
//@ImportResource(value = {"classpath:beans.xml"})
@SpringBootApplication
public class TestMainApplication {
    public static void main(String[] args) {
        //spring启动
        SpringApplication.run(TestMainApplication.class,args);
    }
}
