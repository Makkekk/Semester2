package opgave01ObserverStrategy.models;

public class CurrentConditionsDisplay implements Observer {

    public void update(float temp, float humidity, float pressure) {
        System.out.println("Current conditions: " + temp + "°C, " + humidity + "% humidity, " + pressure + " hPa");
    }
}
