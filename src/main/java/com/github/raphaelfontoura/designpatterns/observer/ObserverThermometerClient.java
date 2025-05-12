package com.github.raphaelfontoura.designpatterns.observer;

public class ObserverThermometerClient implements Observer{

    public static void main(String[] args) {
        Setup setup = new Setup();
        ObserverThermometerClient client = new ObserverThermometerClient();
        setup.getThermometer().addObserver(client);

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            setup.shutdown();
        }
    }

    @Override
    public void update(Observable observable) {
        Thermometer thermometer = (Thermometer) observable;
        System.out.println("Checking temperature : " + thermometer.getTemperatureInKelvin());
        System.out.println("Checking temperature : " + thermometer.getTemperatureInFahrenheit());
        System.out.println("Checking temperature : " + thermometer.getTemperatureInCelsius());
        System.out.println("-------------------------------------------------");
    }

}
