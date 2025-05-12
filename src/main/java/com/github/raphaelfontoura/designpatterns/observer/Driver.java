package com.github.raphaelfontoura.designpatterns.observer;

public class Driver extends Thread {
    public static final long AVERAGE_TIME_BETWEEN_UPDATES_IN_SEC = 5;
    private static final long RANGE_OF_CHANGE = 100;
    public int updateCount = 0;
    private long value = 30000;
    private final Thermometer thermometer;
    private boolean shutdown = false;

    public Driver(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

    @Override
    public void run() {
        try {
            while (!shutdown) {
                Thread.sleep((long) (Math.random() * AVERAGE_TIME_BETWEEN_UPDATES_IN_SEC * 1000));
                value += (Math.random() * RANGE_OF_CHANGE) - (RANGE_OF_CHANGE / 2);
                System.out.println("Driver update #" + updateCount + ": " + value);
                thermometer.driverValue((long) value);
                updateCount++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shutdown() {
        this.shutdown = true;
    }
}
