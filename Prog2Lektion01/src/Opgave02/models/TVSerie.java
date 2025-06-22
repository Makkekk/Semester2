package Opgave02.models;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TVSerie extends Watchables{
    private int numberOfSeasons;


    public TVSerie(String title, int numberOfSeasons,Genre[] genres, ArrayList<Actor> actors) {
        super(title, genres, actors);
        this.numberOfSeasons = numberOfSeasons;
    }

    public List<Genre> getGenresList() {
        return Arrays.asList(super.getGenres());
    }

    @Override
    public String toString() {
        return String.format(
                "TV Series: %s\n  Seasons: %d\n%s",
                getTitle(), // or use the field directly if accessible
                numberOfSeasons,
                super.toString()
        );
    }
}
