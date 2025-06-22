package Opgave02;

import Opgave02.models.*;
import Opgave02.storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        initStorage();

        Storage.PrintMovies();
        Storage.PrintTVSeries();

        List<Movie> moviesByDirector = Storage.findMovieByDirectorName("George Walton Lucas Jr.");
        System.out.println("Movies by George Walton Lucas Jr.:");
        for (Movie movie : moviesByDirector) {
            System.out.println(movie);
        }

        List<TVSerie> actionSeries = Storage.findSeriesByGenre(Genre.COMEDY);
        System.out.println("\nComedy TV Series:");
        for (TVSerie serie : actionSeries) {
            System.out.println(serie);
        }
    }

    private static void initStorage() {
        Director georgeLukas = new Director("George Walton Lucas Jr.", LocalDate.of(1944, 5, 14));
        Director spielberg = new Director("Steven Spielberg", LocalDate.of(1946, 12, 18));
        Actor ford = new Actor("Harrison Ford", LocalDate.of(1942, 7, 13));
        Storage.addActor(ford);
        Actor hamill = new Actor("Mark Hamill", LocalDate.of(1951, 9, 25));
        Storage.addActor(hamill);
        Actor fisher = new Actor("Carrie Fisher", LocalDate.of(1965, 10, 21));
        Storage.addActor(fisher);
        Actor allan = new Actor("Karen Allen", LocalDate.of(1951, 10, 5));
        Storage.addActor(allan);
        Actor aniston = new Actor("Jennifer Aniston", LocalDate.of(1969, 2, 11));
        Storage.addActor(aniston);
        Actor cox = new Actor("Courteney Cox", LocalDate.of(1964, 6, 15));
        Storage.addActor(cox);
        Actor kudrow = new Actor("Lisa Kudrow", LocalDate.of(1963, 7, 30));
        Storage.addActor(kudrow);
        Actor leBlanc = new Actor("Matt LeBlanc", LocalDate.of(1967, 7, 25));
        Storage.addActor(leBlanc);
        Actor perry = new Actor("Matthew Perry", LocalDate.of(1969, 8, 19));
        Storage.addActor(perry);
        Actor schwimmer = new Actor("David Schwimmer", LocalDate.of(1966, 11, 2));
        Storage.addActor(schwimmer);
        Movie starWars = new Movie("Star Wars", 1977, georgeLukas,
                new Genre[]{Genre.ACTION, Genre.FANTACY, Genre.ADVENTURE}, 8.6,
                new ArrayList<>(List.of(ford, hamill, fisher)));

        Movie indy = new Movie("Raiders of the Lost Ark", 1981, spielberg,
                new Genre[]{Genre.ACTION, Genre.ADVENTURE}, 8.4,
                new ArrayList<>(List.of(ford, allan)));
        TVSerie friends = new TVSerie("Friends", 11,
                new Genre[] { Genre.COMEDY, Genre.ROMANCE},
                new ArrayList<>(List.of(aniston, cox, kudrow, leBlanc, perry, schwimmer)));
        Storage.addMovie(starWars);
        Storage.addMovie(indy);
        Storage.addTVSerie(friends);


    }
}