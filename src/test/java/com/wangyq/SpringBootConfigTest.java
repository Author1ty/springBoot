package com.wangyq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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

    @Test
    public void configTest(){
        System.out.println(person.toString());
    }
}
