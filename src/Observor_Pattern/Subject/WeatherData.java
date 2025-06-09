package Observor_Pattern.Subject;

import Observor_Pattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp, pressure, humidity;
    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temp, pressure, humidity);
        }
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurement(float temp, float pressure, float humidity){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;

        measurementChanged();
    }
}
