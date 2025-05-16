package com.github.raphaelfontoura.designpatterns.strategy;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printJobCompleted(Job j) {
        System.out.println("User " + name + " completed job " + j.getId() + " with content: " + j.getContent());
    }
}
