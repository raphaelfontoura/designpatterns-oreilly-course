package com.github.raphaelfontoura.designpatterns.strategy;

public class Job {

    private static int idCounter = 1;
    private int id = idCounter++;
    private User user;
    private String content;
    private final static int DEFAULT_PRIORITY = 50;
    private int priority = DEFAULT_PRIORITY;

    public Job(User user, String content) {
        this.user = user;
        this.content = content;
    }

    public Job(User user, String content, int priority) {
        this.user = user;
        this.content = content;
        this.priority = priority;
    }

    public User getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public int getPriority() {
        return priority;
    }
}
