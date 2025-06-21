package Opgave02.models;

import java.time.LocalDate;

public class Director {
    private String name;
    private LocalDate birthday;

    public Director(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Director: %s (Born: %s)", name, birthday);
    }
}