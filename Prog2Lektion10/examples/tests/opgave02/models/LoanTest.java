package opgave02.models;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class LoanTest {

    @Test
    public void testNoFineOnTimeOrEarly() {
        Loan loan = new Loan(LocalDate.of(2025, 6, 1));
        assertEquals(0, loan.calculateFine(LocalDate.of(2025, 6, 1), true));  // exact day, adult
        assertEquals(0, loan.calculateFine(LocalDate.of(2025, 5, 31), false)); // early return, child
    }

    @Test
    public void testChildFine_1to7DaysLate() {
        Loan loan = new Loan(LocalDate.of(2025, 6, 1));
        assertEquals(10, loan.calculateFine(LocalDate.of(2025, 6, 2), false)); // 1 day late
        assertEquals(10, loan.calculateFine(LocalDate.of(2025, 6, 8), false)); // 7 days late
    }

    @Test
    public void testChildFine_8to14DaysLate() {
        Loan loan = new Loan(LocalDate.of(2025, 6, 1));
        assertEquals(30, loan.calculateFine(LocalDate.of(2025, 6, 9), false));  // 8 days late
        assertEquals(30, loan.calculateFine(LocalDate.of(2025, 6, 15), false)); // 14 days late
    }

    @Test
    public void testChildFine_15PlusDaysLate() {
        Loan loan = new Loan(LocalDate.of(2025, 6, 1));
        assertEquals(45, loan.calculateFine(LocalDate.of(2025, 6, 16), false)); // 15 days late
        assertEquals(45, loan.calculateFine(LocalDate.of(2025, 7, 1), false));  // 30 days late
    }

    @Test
    public void testAdultFine_1to7DaysLate() {
        Loan loan = new Loan(LocalDate.of(2025, 6, 1));
        assertEquals(20, loan.calculateFine(LocalDate.of(2025, 6, 2), true));  // 1 day late
        assertEquals(20, loan.calculateFine(LocalDate.of(2025, 6, 8), true));  // 7 days late
    }

    @Test
    public void testAdultFine_8to14DaysLate() {
        Loan loan = new Loan(LocalDate.of(2025, 6, 1));
        assertEquals(60, loan.calculateFine(LocalDate.of(2025, 6, 9), true));  // 8 days late
        assertEquals(60, loan.calculateFine(LocalDate.of(2025, 6, 15), true)); // 14 days late
    }

    @Test
    public void testAdultFine_15PlusDaysLate() {
        Loan loan = new Loan(LocalDate.of(2025, 6, 1));
        assertEquals(90, loan.calculateFine(LocalDate.of(2025, 6, 16), true)); // 15 days late
        assertEquals(90, loan.calculateFine(LocalDate.of(2025, 7, 1), true));  // 30 days late
    }
}
