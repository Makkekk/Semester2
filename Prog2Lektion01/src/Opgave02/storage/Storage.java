package Opgave02.storage;


import Opgave02.models.*;

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

    public static List<TVSerie> findSeriesByGenre(Genre genre) {
        List<TVSerie> result = new ArrayList<>();
        for (TVSerie tvSerie : tvSeries) {
            if (tvSerie.getGenresList().contains(genre)) {
                result.add(tvSerie);
            }
        }
        return result;
    }
}
