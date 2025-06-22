package opgave01ObserverStrategy.models;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}