package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        // load the Spring config file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext
                ("beanLifeCycle_applicationContext.xml");

        // retrieve the beans from the container
        Coach theCoach = applicationContext.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        applicationContext.close();

    }

}
