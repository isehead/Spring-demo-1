package com.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    // init and destroy methods for beans lifecycle overview

    private void initSampleMethod() {
        System.out.println("Init method");
    }

    private void destroySampleMethod() {
        System.out.println("Destroy method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method");
    }
}
