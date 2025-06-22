package opgave03;

public class Main {
    public static void main(String[] args) {
        // Example: SAS Go Light with 1 hand bag, 1 checked bag of 25 kg
        Baggage baggage1 = new Baggage(1, 1, new double[]{25.0});
        int fee1 = BaggageCalculator.calculateFee(TicketType.GO_LIGHT, baggage1);
        System.out.println("Fee for Go Light baggage1: " + fee1 + " kr");  // Should charge hand baggage + checked baggage fees

        // Example: SAS Go Smart with 1 hand bag, 1 checked bag of 24 kg
        Baggage baggage2 = new Baggage(1, 1, new double[]{24.0});
        int fee2 = BaggageCalculator.calculateFee(TicketType.GO_SMART, baggage2);
        System.out.println("Fee for Go Smart baggage2: " + fee2 + " kr");  // Should charge overweight fee 330 kr for checked bag

        // Example: SAS Business with 1 hand bag, 2 checked bags (22kg, 29kg)
        Baggage baggage3 = new Baggage(1, 2, new double[]{22.0, 29.0});
        int fee3 = BaggageCalculator.calculateFee(TicketType.BUSINESS, baggage3);
        System.out.println("Fee for Business baggage3: " + fee3 + " kr");  // Should charge overweight fee 590 kr for 29 kg bag

        // Example: SAS Go Smart with 2 hand bags (should charge 120 kr for extra hand baggage)
        Baggage baggage4 = new Baggage(2, 1, new double[]{20.0});
        int fee4 = BaggageCalculator.calculateFee(TicketType.GO_SMART, baggage4);
        System.out.println("Fee for Go Smart baggage4: " + fee4 + " kr");
    }
}

