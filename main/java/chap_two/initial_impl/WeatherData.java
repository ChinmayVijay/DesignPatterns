package chap_two.initial_impl;

import java.util.ArrayList;

/**
 * The Observer Pattern defines the One-To-Many relationship between objects, so that
 * when one objects(Subject) state changes all of its dependents are notified and updated automatically.
 *
 *
 * In our case : WeatherData acts like a Subject for all the display elements.
 *
 * Design Principle :
 * "Strive for loosely coupled designs between objects that interact."
 *
 * Simpler Terms : Loosely coupled designs allow us to build flexible OO systems that can handle
 * change because they minimize the interdependency between objects.
 *
 *
 *
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >=0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanges(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature= temperature;
        this.humidity = humidity;
        this.pressure = pressure;


    }
}
