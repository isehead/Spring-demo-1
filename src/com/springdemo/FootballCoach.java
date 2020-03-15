package com.springdemo;

public class FootballCoach implements Coach {

    private FortuneServiceMySample fortuneServiceMySample;

    public FootballCoach(FortuneServiceMySample fortuneServiceMySample) {
        this.fortuneServiceMySample = fortuneServiceMySample;
    }
    public FootballCoach() {
        System.out.println("Inside fbCoach no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return ("Strike 20 penalty kicks on target");
    }

    @Override
    public String getDailyFortune() {
        return ("Daily fortune " + fortuneServiceMySample.getFortune());
    }
}
