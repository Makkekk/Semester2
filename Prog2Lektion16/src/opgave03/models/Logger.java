package opgave03.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Logger {
    private LogDesination destination;

    public Logger(LogDesination destination) {
        this.destination = destination;
    }

    public void setDestination(LogDesination destination) {
        this.destination = destination;
    }

    public void logInfo(String message) {
        String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][INFO] " + message;
        destination.log(logMessage);
    }

    public void logError(String message) {
        String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][ERROR] " + message;
        destination.log(logMessage);
    }
}