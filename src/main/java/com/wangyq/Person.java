package com.wangyq;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 配置文件的值映射到组件中,application.yml
 *
 * 只有这个组件时容器中的组件才能使用容器中的功能
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String str;
    private  int i;
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
