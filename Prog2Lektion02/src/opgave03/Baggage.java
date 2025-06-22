package opgave03;

public class Baggage {
    private int handBags;           // Number of hand baggage pieces
    private int checkedBags;        // Number of checked baggage pieces
    private double[] checkedWeights; // Weight of each checked bag (kg)

    public Baggage(int handBags, int checkedBags, double[] checkedWeights) {
        this.handBags = handBags;
        this.checkedBags = checkedBags;
        this.checkedWeights = checkedWeights;
    }

    public int getHandBags() {
        return handBags;
    }

    public int getCheckedBags() {
        return checkedBags;
    }

    public double[] getCheckedWeights() {
        return checkedWeights;
    }
}

