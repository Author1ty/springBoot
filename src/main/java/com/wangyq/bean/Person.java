package com.wangyq.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 配置文件的值映射到组件中,application.yml
 *
 * 只有这个组件时容器中的组件才能使用容器中的功能 Component
 *
 * 校验数据 Validated Email   只有ConfigurationProperties才支持  value注入方式不支持
 *
 * 只有ConfigurationProperties才支持支持复杂注解 map  list
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    private String str;
    private  int i;
    private Date date;
    private Map map;
    private List list;
    @Email
    private String email;

    @Override
    public String toString() {
        return "Person{" +
                "str='" + str + '\'' +
                ", i=" + i +
                ", date=" + date +
                ", map=" + map +
                ", list=" + list +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
