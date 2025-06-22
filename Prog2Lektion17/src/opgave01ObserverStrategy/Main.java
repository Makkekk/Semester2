package opgave01ObserverStrategy;


import opgave01ObserverStrategy.models.CurrentConditionsDisplay;
import opgave01ObserverStrategy.models.ForeCastDisplay;
import opgave01ObserverStrategy.models.StatisticsDisplay;
import opgave01ObserverStrategy.models.WeatherData;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForeCastDisplay forecastDisplay = new ForeCastDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(forecastDisplay);

        weatherData.measurementsChanged(); // vil kalde update på alle registrerede observers
    }
}