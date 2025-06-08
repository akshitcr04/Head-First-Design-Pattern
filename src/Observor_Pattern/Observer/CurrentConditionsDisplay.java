package Observor_Pattern.Observer;

import Observor_Pattern.Display.DisplayElement;
import Observor_Pattern.Subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp, pressure, humidity;
    private WeatherData weatherData;
    CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
