package Opgave02.models;


import java.time.LocalDate;

public class Actor {
    private String name;
    private LocalDate birthday;

    public Actor(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("Actor: %s (Born: %s)", name, birthday);
    }
}
