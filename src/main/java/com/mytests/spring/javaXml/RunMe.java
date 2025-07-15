package com.mytests.spring.javaXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunMe {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println(ctx.getBean("b0", XmlOnlyBeanWithSingleConstructor.class));
        System.out.println(ctx.getBean("b1", XmlOnlyBean.class));
        System.out.println(ctx.getBean("b2", XmlOnlyBean.class));
    }
}
