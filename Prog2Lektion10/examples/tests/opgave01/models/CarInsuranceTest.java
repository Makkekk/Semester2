package opgave01.models;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CarInsuranceTest {

    @Test
    public void testPremium_Under25_Man_0Years() {
        CarInsurance insurance = new CarInsurance(1000);
        double premium = insurance.calculatePremium(20, false, 0);
        assertEquals(1250, premium, 0.01); // 1000 * 1.25
    }

    @Test
    public void testPremium_Under25_Woman_0Years() {
        CarInsurance insurance = new CarInsurance(1000);
        double premium = insurance.calculatePremium(20, true, 0);
        assertEquals(1187.5, premium, 0.01); // 1000 * 1.25 * 0.95
    }

    @Test
    public void testPremium_Under25_Woman_4Years() {
        CarInsurance insurance = new CarInsurance(1000);
        double premium = insurance.calculatePremium(22, true, 4);
        assertEquals(1009.375, premium, 0.01); // 1000 * 1.25 * 0.95 * 0.85
    }

    @Test
    public void testPremium_Under25_Man_7Years() {
        CarInsurance insurance = new CarInsurance(1000);
        double premium = insurance.calculatePremium(24, false, 7);
        assertEquals(937.5, premium, 0.01); // 1000 * 1.25 * 0.75
    }

    @Test
    public void testPremium_Under25_Woman_InvalidYearsWithoutDamage() {
        CarInsurance insurance = new CarInsurance(1000);

        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            insurance.calculatePremium(24, true, 10);
        });

        assertEquals("Antal år uden skader kan ikke være større end alder minus 18.", ex.getMessage());
    }

    @Test
    public void testPremium_Exactly25_Woman_5Years() {
        CarInsurance insurance = new CarInsurance(1000);
        double premium = insurance.calculatePremium(25, true, 5);
        assertEquals(807.5, premium, 0.01);
    }

    @Test
    public void testPremium_Over25_Man_0Years() {
        CarInsurance insurance = new CarInsurance(1000);
        double premium = insurance.calculatePremium(30, false, 0);
        assertEquals(1000, premium, 0.01);
    }

    @Test
    public void testPremium_InvalidAge_ThrowsException() {
        CarInsurance insurance = new CarInsurance(1000);
        assertThrows(RuntimeException.class, () -> {
            insurance.calculatePremium(17, false, 0);
        });
    }

    @Test
    public void testPremium_NegativeDamageYears_ThrowsException() {
        CarInsurance insurance = new CarInsurance(1000);
        assertThrows(RuntimeException.class, () -> {
            insurance.calculatePremium(25, false, -1);
        });
    }

    @Test
    public void testPremium_TooManyDamageFreeYears_ThrowsException() {
        CarInsurance insurance = new CarInsurance(1000);
        assertThrows(RuntimeException.class, () -> {
            insurance.calculatePremium(25, false, 10); // 25 - 18 = 7 max
        });
    }
}

