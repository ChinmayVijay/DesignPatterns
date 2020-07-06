package chap_two.impl_two;

import java.util.Observable;

public class WeatherDataNew extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataNew() {
    }

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this. humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
