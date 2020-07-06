package chap_two.impl_two;

import java.util.Observable;
import java.util.Observer;

public class CurrentCondNewDisplay implements Observer, NewDisplayElement {

    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentCondNewDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: "+ temperature +"F degrees and " +humidity+ "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataNew){
            WeatherDataNew weatherData = (WeatherDataNew)o;
            this.temperature = weatherData.getTemperature();
            this.humidity  = weatherData.getHumidity();
            display();
        }
    }
}
