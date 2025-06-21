package Opgave02.storage;


import Opgave02.models.Actor;
import Opgave02.models.Director;
import Opgave02.models.Movie;
import Opgave02.models.TVSerie;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static List<Movie> movies = new ArrayList<>();
    private static List<TVSerie> tvSeries = new ArrayList<>();
    private static List<Actor> actors = new ArrayList<>();
    private static List<Director> directors = new ArrayList<>();


    public static void addActor(Actor actor) {
        actors.add(actor);
    }

    public static void addMovie(Movie movie) {
        movies.add(movie);
    }

    public static void addTVSerie(TVSerie tvSerie) {
        tvSeries.add(tvSerie);
    }

    public static void PrintMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public static void PrintTVSeries() {
        for (TVSerie tvSerie : tvSeries) {
            System.out.println(tvSerie);
        }
    }

    public static List<Director> getDirectors() {
        return directors;
    }

    public static List<Movie> findMovieByDirectorName(String directorName) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getDirector() != null && movie.getDirector().getName().equalsIgnoreCase(directorName)) {
                result.add(movie);
            }
        }
        return result;
    }
}
