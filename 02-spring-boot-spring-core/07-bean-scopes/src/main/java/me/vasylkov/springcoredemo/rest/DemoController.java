package me.vasylkov.springcoredemo.rest;

import me.vasylkov.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach myCoach,
            @Qualifier("cricketCoach") Coach anotherCoach)
    {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/check")
    public String check()
    {
        return "Comparing beans: " + (myCoach == anotherCoach);
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
