package by.bsu.vladrabets.cinema.entities;

public class Movie extends BaseEntity {
    private double duration;
    private String title;

    public Movie(double duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Movie update(double duration) {
        this.setDuration(duration);
        return this;
    }
}
