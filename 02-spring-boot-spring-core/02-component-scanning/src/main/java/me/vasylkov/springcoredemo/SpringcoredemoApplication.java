package me.vasylkov.springcoredemo;

import me.vasylkov.springcoredemo.rest.DemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"me.vasylkov.springcoredemo", "me.vasylkov.util"})
@SpringBootApplication
public class SpringcoredemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringcoredemoApplication.class, args);
    }

}
