package me.vasylkov.springcoredemo.config;

import me.vasylkov.springcoredemo.common.Coach;
import me.vasylkov.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig
{
    @Bean("aquatic")
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
