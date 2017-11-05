package com.leerenbo.app;

import com.leerenbo.model.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lirenbo on 2017/10/30.
 */
public class AppContext {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:cache.xml");
        A a = applicationContext.getBean("a", A.class);
        System.out.println(a.getA());
    }
}
