package chap_two.initial_impl;

public class WeatherStatsDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;


    public WeatherStatsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min Temeratures: " +(temperature - 3) + "/" + temperature + "/" + (temperature - 4));

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
