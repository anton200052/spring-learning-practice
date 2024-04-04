package me.vasylkov.RestDemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController
{

    @GetMapping("/hello")
     public String returnHello()
     {
         return "Hello world!";
     }
}
