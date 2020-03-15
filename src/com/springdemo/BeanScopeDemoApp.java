package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the Spring config file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext
                ("beanScope_applicationContext.xml");

        // retrieve the beans from the container
        Coach theCoach = applicationContext.getBean("myCoach", Coach.class);
        Coach alphaCoach = applicationContext.getBean("myCoach", Coach.class);

        // compare if the beans point out to the same object
        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach + "\n");

        // close the context
        applicationContext.close();

    }

}
