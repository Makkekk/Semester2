package opgave03.models;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogDestination implements LogDesination{
    private String filename;

    public FileLogDestination(String filename) {
        this.filename = filename;
    }

    @Override
    public void log(String message) {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename, true))) { // append = true
            out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
