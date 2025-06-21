package Opgave02.models;

import java.util.ArrayList;

public class Movie extends Watchables {
    private int productionYear;
    private Director director;
    private double rating;

    public Movie(String title, int productionYear, Director director,Genre[] genres,double rating, ArrayList<Actor> cast) {
        super(title, genres, cast);
        this.productionYear = productionYear;
        this.director = director;
        this.rating = rating;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return String.format(
                "Movie: %s (%d)\n  Director: %s\n  Rating: %.1f\n%s",
                getTitle(),
                productionYear,
                director, // <-- should use %s in format string
                rating,
                super.toString()
        );    }
}

