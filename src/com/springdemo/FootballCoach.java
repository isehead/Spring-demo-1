package com.springdemo;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach() {
        System.out.println("Inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return ("Strike 20 penalty kicks on target");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
