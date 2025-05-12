package com.github.raphaelfontoura.designpatterns.observer;

public class Setup {

    private Driver driver;
    private Thermometer thermometer;

    public Setup() {
        thermometer = new Thermometer();
        driver = new Driver(thermometer);
        this.driver.start();
    }

    public void shutdown() {
        driver.shutdown();
    }

    public Thermometer getThermometer() {
        return thermometer;
    }
}
