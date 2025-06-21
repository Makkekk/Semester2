package Opgave02.models;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Watchables {
    private String title;
    private Genre[] genres;
    private ArrayList<Actor> cast;

    public Watchables(String title, Genre[] genres, ArrayList<Actor> cast) {
        this.title = title;
        this.genres = genres;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public Genre[] getGenres() {
        return genres;
    }

    public ArrayList<Actor> getCast() {
        return cast;
    }

    @Override
    public String toString() {
        String result = title + "\n  Genres: " + Arrays.toString(genres) + "\n  Cast:";
        for (Actor actor : cast) {
            result += "\n    - " + actor;
        }
        return result;
    }
}

