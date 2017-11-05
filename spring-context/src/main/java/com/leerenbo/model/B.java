package com.leerenbo.model;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by lirenbo on 2017/10/30.
 */
@Component
public class B {
    private String b;
    @Resource
    private A a;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
