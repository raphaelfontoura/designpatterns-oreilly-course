package com.github.raphaelfontoura.designpatterns.strategy;

import java.util.Random;

public class Printer extends Thread {

    public enum QueueStrategy {
        FIFO(new SimpleFIFOPrinterQueue()), JOB_PRIORITY(new JobPriorityPrinterQueue());

        private PrinterQueue queue;

        QueueStrategy(PrinterQueue queue) {
            this.queue = queue;
        }
    }

    private boolean shouldrun = true;
    // private PrinterQueue printerQueue = new SimpleFIFOPrinterQueue();
    private PrinterQueue printerQueue;
    private Random myRandom = new Random();

    public Printer() {
        this(QueueStrategy.FIFO);
    }

    public Printer(QueueStrategy queueStrategy) {
        this.printerQueue = queueStrategy.queue;
    }

    public void run() {
        while (shouldrun) {
            try {
                Thread.sleep(100);
                synchronized (this) {
                    getNextJob();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void getNextJob() {
        Job j = this.printerQueue.getNextJob();
        if (j != null) {
            this.printJob(j);
            this.informUser(j);
        }
    }

    private void printJob(Job j) {
        try {
            System.out.println("Printing job: " + j.getId() + " with priority: " + j.getPriority());
            Thread.sleep(myRandom.nextInt(100));
            System.out.println("Printed: " + this.getJobAsPrinterLanguage(j));
            Thread.sleep(myRandom.nextInt(100));
            System.out.println("End of job: " + j.getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void informUser(Job j) {
        if (j.getUser() != null) {
            System.out.println("Notifying the user: " + j.getUser().getName());
            j.getUser().printJobCompleted(j);
        }
    }

    private String getJobAsPrinterLanguage(Job j) {
        String retVal = new StringBuilder(j.getContent().toUpperCase())
                .reverse().toString();
        System.out.println("Translated: " + j.getContent() + " --> " + retVal);
        return retVal;
    }

    synchronized public void print(Job job) {
        this.printerQueue.addJob(job);
    }

    synchronized public void shutdownPrinter() {
        this.shouldrun = false;
    }

}
