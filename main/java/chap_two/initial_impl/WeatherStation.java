package chap_two.initial_impl;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay
                = new CurrentConditionsDisplay(weatherData);

        WeatherStatsDisplay weatherStatsDisplay = new WeatherStatsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);


        weatherData.setMeasurements(85,70,33.2f);
        weatherData.measurementsChanges();
    }
}
