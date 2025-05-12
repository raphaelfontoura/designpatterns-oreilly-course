package com.github.raphaelfontoura.designpatterns.observer;

public class Thermometer extends Observable {

    public double temperatureInKelvin = -1.0;
    private final String KELVIN_FORMAT = "%,.1f K";
    private final String FAHRENHEIT_FORMAT = "%,.1f F";
    private final String CELSIUS_FORMAT = "%,.1f C";

    void driverValue(long value) {
        this.temperatureInKelvin = value/100.0;
        super.notifyObservers();
    }

    public String getTemperatureInKelvin() {
        return String.format(KELVIN_FORMAT, temperatureInKelvin);
    }
    public String getTemperatureInFahrenheit() {
        return String.format(FAHRENHEIT_FORMAT, ((temperatureInKelvin - 273.15) * 9/5) + 32);
    }
    public String getTemperatureInCelsius() {
        return String.format(CELSIUS_FORMAT, temperatureInKelvin - 273.15);
    }
}
