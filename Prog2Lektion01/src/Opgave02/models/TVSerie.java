package Opgave02.models;

import java.util.ArrayList;

public class TVSerie {
    private String title;
    private int numberOfSeasons;
    private Genre[] genres;
    private ArrayList<Actor> cast;

    public TVSerie(String title, int numberOfSeasons, Genre[] genres, ArrayList<Actor> cast) {
        this.title = title;
        this.numberOfSeasons = numberOfSeasons;
        this.genres = genres;
        this.cast = cast;
    }
}
