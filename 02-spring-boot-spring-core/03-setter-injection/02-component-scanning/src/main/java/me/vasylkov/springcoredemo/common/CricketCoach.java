package me.vasylkov.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{

    @Override
    public String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes!!!!";
    }

    @Override
    public String getName()
    {
        return "cricketCoach";
    }
}
