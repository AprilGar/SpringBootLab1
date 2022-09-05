package com.example.task_01.models;

//EXTENSION - Celebration DTO with a single message property

public class Celebration {

    private String message;

    public Celebration(String message){
        this.message = message;
    }

    public Celebration() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
