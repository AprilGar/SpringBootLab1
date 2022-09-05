package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class Task01Controller {

    @GetMapping
    public Greeting greeting(@RequestParam(value="timeOfDay") String timeOfDay){
        return new Greeting("April", "Good " + timeOfDay);
    }
// Multiple request parameters
//    @GetMapping
//    public Greeting greeting(@RequestParam(value="timeOfDay") String timeOfDay, @RequestParam(value="name") String name){
//        return new Greeting(name, timeOfDay);
//    }
    // IN URL type: /greeting?timeOfDay=evening&name=April

    //Extension 2 - Celebration DTO method
    @GetMapping (value = "/christmas")
    public Celebration festiveGreeting(){
        return new Celebration("merry christmas!");
} //IN URL: http://localhost:8080/greeting/christmas

}
