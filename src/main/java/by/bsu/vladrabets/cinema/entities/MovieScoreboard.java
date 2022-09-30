package by.bsu.vladrabets.cinema.entities;

public class MovieScoreboard {
    private String movieId;
    private String screen;
    private String next;

    public MovieScoreboard(String movieId, String screen, String next) {
        this.movieId = movieId;
        this.screen = screen;
        this.next = next;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
