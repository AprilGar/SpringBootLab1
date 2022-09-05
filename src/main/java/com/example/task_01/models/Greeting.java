package com.example.task_01.models;

//POJO - MVP
public class Greeting {

    private String name;

    private String timeOfDay;

    //constructor
    public Greeting(String name, String timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    //overloaded constructor
    public Greeting() {
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
