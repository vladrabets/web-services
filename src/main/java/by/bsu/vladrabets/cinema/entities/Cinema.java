package by.bsu.vladrabets.cinema.entities;

import java.util.ArrayList;

public class Cinema extends BaseEntity {
    private String name;
    private int PlacesNumber;
    private Location location;
    private MovieScoreboard[] movieScoreboards;
    private final ArrayList<String> Movies;

    public Cinema(String name, int placesNumber, Location location, MovieScoreboard[] movieScoreboards, ArrayList<String> Movies) {
        this.name = name;
        this.location = location;
        this.movieScoreboards = movieScoreboards;
        this.Movies = Movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlacesNumber() {
        return PlacesNumber;
    }

    public void setPlacesNumber(int placesNumber) {
        PlacesNumber = placesNumber;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public MovieScoreboard[] getMovieScoreboard() {
        return movieScoreboards;
    }

    public void setMovieScoreboard(MovieScoreboard[] movieScoreboards) {
        this.movieScoreboards = movieScoreboards;
    }

    public ArrayList<String> getMovies() {
        return Movies;
    }
}
