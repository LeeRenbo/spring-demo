package com.leerenbo.model;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by lirenbo on 2017/10/30.
 */
@Component
public class A {
    @Resource
    private B b;
    private String a;

    public String tttt() {
        System.out.println("tttt");
        return "tttt";
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
