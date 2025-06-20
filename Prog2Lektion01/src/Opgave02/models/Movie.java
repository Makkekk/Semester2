package Opgave02.models;

import java.util.ArrayList;

public class Movie {
    private String title;
    private int productionYear;
    private Director director;
    private Genre[] genres;
    private double rating;
    private ArrayList<Actor> cast;

    public Movie(String title, int productionYear, Director director, Genre[] genres,
                 double rating, ArrayList<Actor> cast) {
        this.title = title;
        this.productionYear = productionYear;
        this.director = director;
        this.genres = genres;
        this.rating = rating;
        this.cast = cast;
    }
}

