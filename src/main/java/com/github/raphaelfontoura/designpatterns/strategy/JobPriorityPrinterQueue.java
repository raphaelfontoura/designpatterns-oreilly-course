package com.github.raphaelfontoura.designpatterns.strategy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class JobPriorityPrinterQueue implements PrinterQueue {
    
    private Queue<Job> queue = new PriorityQueue<>(10, new Comparator<Job>() {
        @Override
        public int compare(Job o1, Job o2) {
            return Integer.compare(o1.getPriority(), o2.getPriority());
        }
    });

    @Override
    public void addJob(Job job) {
        queue.add(job);
    }
    @Override
    public Job getNextJob() {
        return queue.poll();
    }

}
