package Observor_Pattern.Observer;

import Observor_Pattern.Display.DisplayElement;
import Observor_Pattern.Subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp, pressure, humidity;
    private WeatherData weatherData;
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("📡 Current Weather Conditions:");
        System.out.println("🌡️ Temperature: " + temp + "°C");
        System.out.println("💧 Humidity: " + humidity + "%");
        System.out.println("🌬️ Pressure: " + pressure + " hPa");
        System.out.println("-----------------------------------");
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}
