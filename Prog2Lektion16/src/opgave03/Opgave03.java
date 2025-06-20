package opgave03;

import opgave03.models.Logger;
import opgave03.models.WebServer;

public class Opgave03 {
    public static void main(String[] args) {
        WebServer server = new WebServer(new Logger());
        server.handleRequest("Hello World");
        server.handleRequest("");
    }
}