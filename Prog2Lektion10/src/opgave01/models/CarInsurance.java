package opgave01.models;

public class CarInsurance {
    private final double basisPremium; // invariant: basisPremium > 0.
    /**
     * Create a CarInsurance.
     * Pre: basisPremium > 0.
     */
    public CarInsurance (double basisPremium) {
        this.basisPremium = basisPremium;
    }
    /**
     * Calculate and return a premium based of the following rules:
     * - person with age below 25: 25% is added to the basis premium,
     * - woman: the basis prem      ium is reduced with 5%,
     * - if the person have been driving without damages for:
     * - 0 to 2 years, the basis premium is reduced with 0%,
     * - 3 to 5 years, the basis premium is reduced with 15%,
     * - 6 to 8 years, the basis premium is reduced with 25%,
     * - more than 8 years, the basis premium is reduced with 35%.
     * Throws a RuntimeException, if age < 18, or yearsWithoutDamage < 0,
     * or YearsWithoutDamage > age-18.
     */
    public double calculatePremium(int age, boolean isWoman, int yearsWithoutDamage) {
        if (age < 18) {
            throw new RuntimeException("Alder skal være mindst 18 år.");
        } else if (yearsWithoutDamage < 0) {
            throw new RuntimeException("Antal år uden skader kan ikke være negativt.");
        } else if (yearsWithoutDamage > age - 18) {
            throw new RuntimeException("Antal år uden skader kan ikke være større end alder minus 18.");

        }

        double premium = basisPremium;

        if (age < 25) {
            premium *= 1.25; // 25% surcharge
        }

        if (isWoman) {
            premium *= 0.95; // 5% discount
        }

        if (yearsWithoutDamage <= 2) {
            // no discount
        } else if (yearsWithoutDamage <= 5) {
            premium *= 0.85; // 15% discount
        } else if (yearsWithoutDamage <= 8) {
            premium *= 0.75; // 25% discount
        } else {
            premium *= 0.65; // 35% discount
        }

        return premium;
    }

}

