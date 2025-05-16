package com.github.raphaelfontoura.designpatterns.strategy;

public interface PrinterQueue {

    /*
     * Adds a job to the printer queue.
     */
    void addJob(Job job);
    /*
     * Removes the job that is next in the queue.
     * Returns null if there are no jobs in the queue.
     */
    Job getNextJob();

}
