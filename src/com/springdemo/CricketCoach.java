package com.springdemo;

public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    public void setEmailAddress(String emailAddress) {
        System.out.println("Setting e-mail address..");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Setting team..");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return ("Cricket workout");
    }

    @Override
    public String getDailyFortune() {
        return ("Cricket fortune");
    }
}
