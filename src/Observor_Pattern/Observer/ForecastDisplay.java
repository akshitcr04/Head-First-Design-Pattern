package Observor_Pattern.Observer;

import Observor_Pattern.Display.DisplayElement;
import Observor_Pattern.Subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temp, pressure, humidity;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("🔮 Forecast: ");
        if (temp > 40) {
            System.out.println("Improving weather on the way!");
        } else if (temp > 20 && temp < 30) {
            System.out.println("More of the same.");
        } else if (humidity > 44) {
            System.out.println("Rain incoming!!");
        } else {
            System.out.println("Watch out for cold weather");
        }
        System.out.println("-----------------------------------");
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
