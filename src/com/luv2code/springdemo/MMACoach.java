package com.luv2code.springdemo;

public class MMACoach implements Coach{
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Francis Ngannou does 200 push ups per day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
