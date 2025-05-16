package com.github.raphaelfontoura.designpatterns.strategy;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleFIFOPrinterQueue implements PrinterQueue {
    
    private Queue<Job> queue = new LinkedList<>();

    @Override
    public void addJob(Job job) {
        queue.add(job);
    }
    @Override
    public Job getNextJob() {
        return queue.poll();
    }

}
