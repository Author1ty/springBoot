package com.wangyq.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
public class PersonConfigValue {

    @Value("${person.str}")
    private String str;
    @Value("#{11*2}")
    private  int i;
    @Value("1996/11/18")
    private Date date;
    private Map map;
    private List list;

    @Override
    public String toString() {
        return "Person{" +
                "str='" + str + '\'' +
                ", i=" + i +
                ", date=" + date +
                ", map=" + map +
                ", list=" + list +
                '}';
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
