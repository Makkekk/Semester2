package Opgave03.Models;

public class Truck {
    private int topSpeed;
    private int acceleration;
    private int currentSpeed = 0;
    private int maxCapacity;
    private int currentLoad = 0;

    public Truck(int topSpeed, int acceleration, int maxCapacity) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.maxCapacity = maxCapacity;
    }

    public void displayInfo() {
        System.out.println(this.getClass().getSimpleName() + ", current speed: " + currentSpeed);
        System.out.println("Loaded weight: " + currentLoad);
    }

    public void accelerate() {
        currentSpeed += (topSpeed - currentSpeed) * acceleration / 100;
    }

    public void brake() {
        currentSpeed -= (currentSpeed) * 30 / 100;
    }

    public void loadGoods(int amount) {
        if ((currentLoad + amount) > maxCapacity) {
            throw new IllegalArgumentException("Maximum capacity(" + maxCapacity + ") exceeded");
        }
        currentLoad += amount;
    }

    public void unload() {
        currentLoad = 0;
    }
}