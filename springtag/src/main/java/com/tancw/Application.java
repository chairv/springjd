package com.tancw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/8/27.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext beans = new ClassPathXmlApplicationContext("classpath:application.xml");
    }
}
