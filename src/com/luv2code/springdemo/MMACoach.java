package com.luv2code.springdemo;

public class MMACoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Francis Ngannou got beaten by Stipe Miocic";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
