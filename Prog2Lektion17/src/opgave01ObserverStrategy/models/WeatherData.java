package opgave01ObserverStrategy.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;
    private Random random = new Random();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        temperature = getTemperature();
        humidity = getHumidity();
        pressure = getPressure();
        notifyObservers();

    }

    private float getTemperature() {
        return Math.round(random.nextFloat(-20, 40) * 100) / 100.0f;
    }

    private float getHumidity() {
        return Math.round(random.nextFloat(2, 98));
    }

    private float getPressure() {
        return random.nextInt(900, 1080);
    }
}