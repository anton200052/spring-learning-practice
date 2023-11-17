package me.vasylkov.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Spend 30 min in betting practice";
    }
}
