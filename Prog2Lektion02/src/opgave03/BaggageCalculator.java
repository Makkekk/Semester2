package opgave03;

public class BaggageCalculator {

    public static int calculateFee(TicketType ticketType, Baggage baggage) {
        int totalFee = 0;

        int handBags = baggage.getHandBags();
        int checkedBags = baggage.getCheckedBags();
        double[] weights = baggage.getCheckedWeights();

        // Hand baggage fee
        if (ticketType == TicketType.GO_LIGHT) {
            // Go Light must pay for all hand baggage
            if (handBags > 0) {
                totalFee += 120 * handBags;
            }
        } else if (ticketType == TicketType.GO_SMART || ticketType == TicketType.BUSINESS) {
            // 1 hand baggage allowed free
            if (handBags > 1) {
                totalFee += 120 * (handBags - 1);
            }
        }

        // Allowed checked bags and max weights per ticket
        int allowedCheckedBags = 0;
        double maxWeightPerBag = 0;

        if (ticketType == TicketType.GO_LIGHT) {
            allowedCheckedBags = 0;
            maxWeightPerBag = 0; // no checked bags allowed for free
        } else if (ticketType == TicketType.GO_SMART) {
            allowedCheckedBags = 1;
            maxWeightPerBag = 23;
        } else if (ticketType == TicketType.BUSINESS) {
            allowedCheckedBags = 2;
            maxWeightPerBag = 32;
        }

        // Extra checked bags fee
        if (checkedBags > allowedCheckedBags) {
            totalFee += 310 * (checkedBags - allowedCheckedBags);
        }

        // Weight fees for each checked bag
        for (int i = 0; i < checkedBags; i++) {
            double weight = weights[i];

            // For GO_LIGHT, every checked bag costs extra 310 (already counted above, but safe to add here too)
            if (ticketType == TicketType.GO_LIGHT) {
                totalFee += 310; // count fee for each checked bag since none allowed
            }

            // Overweight fees
            if (weight > 23 && weight <= 28) {
                totalFee += 330;
            } else if (weight > 28) {
                totalFee += 590;
            }
        }

        return totalFee;
    }
}
