package opgave01ObserverStrategy.models;

public class StatisticsDisplay implements Observer{

    public void update(float temp, float humidity, float pressure) {
        System.out.println("Current conditions: " + temp + "°C, " + humidity + "% humidity, " + pressure + " hPa");
        // Implementation for updating statistics display
    }
}