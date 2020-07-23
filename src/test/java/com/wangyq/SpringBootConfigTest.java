package com.wangyq;

import com.wangyq.bean.Person;
import com.wangyq.bean.PersonConfigValue;
import com.wangyq.bean.PersonPropertySource;
import com.wangyq.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springBoot单元测试
 * 可以在测试期间类似于编码一样诸如容器的功能
 *
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigTest {
    @Autowired
    Person person;
    @Autowired
    PersonConfigValue personConfigValue;
    @Autowired
    PersonPropertySource personPropertySource;
    @Autowired
    ApplicationContext ioc;



    @Test
    public void configTest(){
        System.out.println(person.toString());
    }

    @Test
    public void configValueTest(){
        System.out.println(personConfigValue.toString());
    }

    @Test
    public void personPropertySource(){
        System.out.println(personPropertySource.toString());
    }


    @Test
    public void beanHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }
}
