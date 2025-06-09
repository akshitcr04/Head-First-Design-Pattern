package Observor_Pattern;

import Observor_Pattern.Observer.CurrentConditionsDisplay;
import Observor_Pattern.Observer.ForecastDisplay;
import Observor_Pattern.Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurement(80, 65, 30.4f);
        weatherData.setMeasurement(22, 25, 10.4f);
    }
}
