package opgave02.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int calculateFine(LocalDate actualDate, boolean adult) {
        long daysOver = ChronoUnit.DAYS.between(returnDate, actualDate);
        if (daysOver <= 0) {
            return 0;
        }

        if (daysOver <= 7) {
            if (adult) {
                return 20;
            } else {
                return 10;
            }
        } else if (daysOver <= 14) {
            if (adult) {
                return 60;
            } else {
                return 30;
            }
        } else {
            if (adult) {
                return 90;
            } else {
                return 45;
            }
        }
    }
}
