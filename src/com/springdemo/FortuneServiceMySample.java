package com.springdemo;

import java.util.Random;

public class FortuneServiceMySample implements FortuneService {

    private String fortunes[] = {"Cash in", "Sell out", "Bro down"};
    Random randomFortune = new Random();

    @Override
    public String getFortune() {
        int i = randomFortune.nextInt(3);
        return ("#" + i + ": " + fortunes[i]);
    }
}
