package opgave03.models;

public class ConsoleLogDestination implements LogDesination{
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
