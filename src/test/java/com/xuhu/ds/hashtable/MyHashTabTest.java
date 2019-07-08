package com.xuhu.ds.hashtable;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashTabTest {

    @Test
    public void test() {
        MyHashTab<Emp> tab = new MyHashTab<>(10);
        Emp e1 = new Emp(1, "Tom");
        Emp e2 = new Emp(2, "Tom2");
        Emp e5 = new Emp(5, "Tom5");
        Emp e255 = new Emp(255, "Tom255");

        tab.put(e1.getNo(), e1);
        tab.put(e2.getNo(), e2);
        tab.put(e5.getNo(), e5);
        tab.put(e255.getNo(), e255);


        tab.show();


        System.out.println("=================================");

        System.out.println("test:" + tab.get(e255.getNo()));

    }
}

class Emp{
    private Integer no;
    private String name;

    public Emp(Integer no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}