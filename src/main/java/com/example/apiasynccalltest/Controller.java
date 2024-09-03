package com.example.apiasynccalltest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Controller {

    @GetMapping(value = "/get-random")
    public int getRandomNumber() throws InterruptedException {
        Random generator = new Random();
        int number = generator.nextInt(11);

        Thread.sleep(5000);
        System.out.println("Generated and return: " + number);
        return number;
    }

}
