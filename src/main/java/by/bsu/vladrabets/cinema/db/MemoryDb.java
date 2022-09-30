package by.bsu.vladrabets.cinema.db;

import by.bsu.vladrabets.cinema.entities.Movie;
import by.bsu.vladrabets.cinema.entities.Location;
import by.bsu.vladrabets.cinema.entities.MovieScoreboard;
import by.bsu.vladrabets.cinema.entities.Cinema;

import java.util.ArrayList;
import java.util.Arrays;

public class MemoryDb {
    private static final ArrayList<Movie> MOVIES = new ArrayList<>(Arrays.asList(
            new Movie(1.4, "Titanic"),
            new Movie(2.5, "Fast and Furious"),
            new Movie(3.1, "Mad Max"),
            new Movie(2.1, "Fight Club"),
            new Movie(2.2, "Green Elephant"),
            new Movie(1.8, "Seven"),
            new Movie(1.6, "Lion King"),
            new Movie(2.3, "American Psycho")
    ));

    private static final ArrayList<String> cinemaMovies = new ArrayList<>(Arrays.asList(
            MOVIES.get(0).getId(), MOVIES.get(5).getId()
    ));
    private static final MovieScoreboard[] MOVIE_SCOREBOARDS = cinemaMovies
            .stream()
            .map(id -> new MovieScoreboard(id, "Home Alone", "Harry Potter"))
            .toArray(MovieScoreboard[]::new);
    private static final Location LOCATION = new Location("53.9024716", "27.5618225");
    private static final Cinema CINEMA = new Cinema("October cinema", 1000, LOCATION, MOVIE_SCOREBOARDS, cinemaMovies);

    public static Cinema getCinema() {
        return CINEMA;
    }

    public static Movie[] getMovies() {
        Movie[] movies = new Movie[MOVIES.size()];
        return MOVIES.toArray(movies);
    }

    public static Movie[] getCinemaMovies() {
        return CINEMA
                .getMovies()
                .stream()
                .map(MemoryDb::getMovie)
                .toArray(Movie[]::new);
    }

    public static Movie getMovie(String id) {
        return MOVIES
                .stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public static Cinema addMovieToCinema(String id) {
        CINEMA.getMovies().add(id);
        return CINEMA;
    }

    public static Movie updateMovie(Movie movie, double duration) {
        return movie.update(duration);
    }

    public static boolean removeMovieFromCinema(String id) {
        return CINEMA.getMovies().remove(id);
    }

    public static Location getCinemaLocation() {
        return CINEMA.getLocation();
    }

    public static Cinema updateCinemaLocation(Location location) {
        CINEMA.setLocation(location);
        return CINEMA;
    }

    public static MovieScoreboard[] getMovieScoreboard() {
        return CINEMA.getMovieScoreboard();
    }
}
