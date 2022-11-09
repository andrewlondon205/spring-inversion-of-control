package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MMALifeCycleApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach c1 = context.getBean("myMMACoach",Coach.class);
        Coach c2 = context.getBean("myMMACoach",Coach.class);

        Coach fighter1 = context.getBean("UFCFighter",Coach.class);
        Coach fighter2 = context.getBean("UFCFighter",Coach.class);

//        System.out.println(c1.getDailyWorkout());
//        System.out.println(c2.getDailyWorkout());
//        System.out.println(c1 == c2);

        System.out.println(fighter1.getDailyWorkout());
        System.out.println(fighter2.getDailyWorkout());
        System.out.println(fighter1==fighter2);
        context.close();
    }
}
