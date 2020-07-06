package chap_two.impl_two;

public class WeatherStationNew {
    public static void main(String[] args) {
        WeatherDataNew weatherDataNew = new WeatherDataNew();

        CurrentCondNewDisplay currentCondNewDisplay = new CurrentCondNewDisplay(weatherDataNew);
        ForecastNewDisplay forecastNewDisplay = new ForecastNewDisplay(weatherDataNew);
        HeatIndexNewDisplay heatIndexNewDisplay = new HeatIndexNewDisplay(weatherDataNew);

        weatherDataNew.setMeasurements(85,70,32.7f);
    }
}
