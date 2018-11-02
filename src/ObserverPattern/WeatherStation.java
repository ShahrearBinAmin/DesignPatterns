package ObserverPattern;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditions= new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay  = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(40,50,30);
        weatherData.setMeasurements(1,2,3);

    }
}
