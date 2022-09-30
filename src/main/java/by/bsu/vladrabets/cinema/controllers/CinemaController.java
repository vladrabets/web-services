package by.bsu.vladrabets.cinema.controllers;

import by.bsu.vladrabets.cinema.db.MemoryDb;
import by.bsu.vladrabets.cinema.entities.Movie;
import by.bsu.vladrabets.cinema.entities.Cinema;
import by.bsu.vladrabets.cinema.entities.Location;
import by.bsu.vladrabets.cinema.entities.MovieScoreboard;

public class CinemaController {
    public static Cinema getCinema() {
        return MemoryDb.getCinema();
    }

    public static Movie[] getAllMovies() {
        return MemoryDb.getMovies();
    }

    public static Movie[] getMovies() {
        return MemoryDb.getCinemaMovies();
    }

    public static Movie getMovie(String id) {
        if (id == null) {
            throw new RuntimeException("id param should be specified");
        }

        return MemoryDb.getMovie(id);
    }

    public static Cinema addMovieToCinema(String id) throws RuntimeException {
        if (id == null) {
            throw new RuntimeException("id param should be specified");
        }

        Movie movie = MemoryDb.getMovie(id);

        if (movie == null) {
            throw new RuntimeException("route with specified id is not found");
        }

        return MemoryDb.addMovieToCinema(id);
    }

    public static Movie updateMovie(String id, double duration) throws RuntimeException {
        if (id == null || duration == 0.0) {
            throw new RuntimeException("id and duration should be specified");
        }

        Movie movie = MemoryDb.getMovie(id);

        if (movie == null) {
            throw new RuntimeException("route not found");
        }

        return MemoryDb.updateMovie(movie, duration);
    }

    public static boolean deleteMovie(String id) {
        if (id == null) {
            throw new RuntimeException("id param should be specified");
        }

        return MemoryDb.removeMovieFromCinema(id);
    }

    public static Location getLocation() {
        return MemoryDb.getCinemaLocation();
    }

    public static Cinema updateLocation(String latitude, String longitude) {
        if (latitude == null || longitude == null) {
            throw new RuntimeException("latitude and longitude should be specified");
        }

        Location location = new Location(latitude, longitude);
        return MemoryDb.updateCinemaLocation(location);
    }

    public static MovieScoreboard[] getMovieScoreboard() {
        return MemoryDb.getMovieScoreboard();
    }
}
