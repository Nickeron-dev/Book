package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( configLocation: "applicationContext");
        TestBean testBean = context.getBean(name: "testBean", TestBean.class);

        System.out.println(testBean.getName());

        context.close();
    }
}
