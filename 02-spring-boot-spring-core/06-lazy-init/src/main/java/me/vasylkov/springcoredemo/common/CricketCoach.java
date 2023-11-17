package me.vasylkov.springcoredemo.common;

import jakarta.annotation.Priority;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{
    public CricketCoach()
    {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes!!!! _)";
    }
}
