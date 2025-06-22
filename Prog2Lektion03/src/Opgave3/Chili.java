package Opgave3;

public class Chili implements Measurable{
    private String name;
    private double scovilleStrenght;

    public Chili(String name, double scovilleStrenght) {
        this.name = name;
        this.scovilleStrenght = scovilleStrenght;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return scovilleStrenght;
    }
    @Override
    public String toString() {
        return name + " (" + scovilleStrenght + " Scoville)";
    }
}
