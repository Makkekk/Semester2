package opgave03;

import opgave03.models.ConsoleLogDestination;
import opgave03.models.FileLogDestination;
import opgave03.models.Logger;
import opgave03.models.WebServer;

public class Opgave03 {
    public static void main(String[] args) {
        Logger logger = new Logger(new ConsoleLogDestination());
        WebServer server = new WebServer(logger);

        server.handleRequest("Hello World");
        server.handleRequest("");

        // Skift log destination til fil dynamisk
        logger.setDestination(new FileLogDestination("log.txt"));
        server.handleRequest("Logging to file now");
    }
}