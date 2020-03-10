package com.springdemo;

public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return ("Strike 20 penalty kicks on target");
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
