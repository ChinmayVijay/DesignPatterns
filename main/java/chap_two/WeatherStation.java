package chap_two;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay
                = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        currentConditionsDisplay.update(80,65.5f,31.5f);
        currentConditionsDisplay.display();
    }
}
