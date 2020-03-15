package com.springdemo;

public class CheckFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return ("Today is your lucky day (CheckFortuneService default)");
    }
}
