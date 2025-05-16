package com.github.raphaelfontoura.designpatterns.strategy;

import java.util.Random;

import com.github.raphaelfontoura.designpatterns.strategy.Printer.QueueStrategy;

public class Main {

    private static final int NUMBER_OF_JOBS = 10;
    private static final int MAX_JOB_DURATION_IN_SEC = 2;

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Starting experiment...");
        System.out.println("==========================");
        User[] u = {
            new User("Petter"),
            new User("John"),
            new User("Mary")
        };

        Printer p = new Printer(QueueStrategy.JOB_PRIORITY);

        for (int i = 0; i < NUMBER_OF_JOBS; i++) {
            p.print(
                new Job(
                    u[r.nextInt(u.length)],
                    "Content set (something random = " + r.nextInt(100) + ") " + i,
                    r.nextInt(100)
                )
            );
        }
        p.start();
        try {
            Thread.sleep(1000 * MAX_JOB_DURATION_IN_SEC);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p.shutdownPrinter();
        System.out.println("==========================");
        System.out.println("Experiment finished.");
    }
}
