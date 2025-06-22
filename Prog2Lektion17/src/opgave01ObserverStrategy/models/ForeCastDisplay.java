package opgave01ObserverStrategy.models;

public class ForeCastDisplay implements Observer {
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Current conditions: " + temp + "°C, " + humidity + "% humidity, " + pressure + " hPa");
        // Implementation for updating forecast display
    }
}