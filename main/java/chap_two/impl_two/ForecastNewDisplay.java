package chap_two.impl_two;

import java.util.Observable;
import java.util.Observer;

public class ForecastNewDisplay implements Observer, NewDisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    Observable observable;

    public ForecastNewDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataNew){
            WeatherDataNew weatherDataNew = (WeatherDataNew)o;
            this.lastPressure = weatherDataNew.getPressure();
            display();
        }
    }
}
