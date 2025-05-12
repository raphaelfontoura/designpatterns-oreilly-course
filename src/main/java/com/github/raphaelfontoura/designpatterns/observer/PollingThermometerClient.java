package com.github.raphaelfontoura.designpatterns.observer;

public class PollingThermometerClient {
    private final static long SEC_TO_RUN = 20;
    private final static long MS_BETWEEN_POOLS = 50;

    public static void main(String[] args) {
        Setup setup = new Setup();
        Thermometer thermometer = setup.getThermometer();
        
        long count = SEC_TO_RUN * 1000 / MS_BETWEEN_POOLS;
        try {
            for (int i = 0; i < count; i++) {
                Thread.sleep(MS_BETWEEN_POOLS);
                System.out.println("Checking temperature #" + i + ": " + thermometer.getTemperatureInKelvin());
                System.out.println("Checking temperature #" + i + ": " + thermometer.getTemperatureInFahrenheit());
                System.out.println("Checking temperature #" + i + ": " + thermometer.getTemperatureInCelsius());
                System.out.println("-------------------------------------------------");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            setup.shutdown();
        }
    }

}
