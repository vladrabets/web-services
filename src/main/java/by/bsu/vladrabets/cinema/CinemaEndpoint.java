package by.bsu.vladrabets.cinema;

import by.bsu.vladrabets.cinema.controllers.CinemaController;
import by.bsu.vladrabets.cinema.entities.Movie;
import by.bsu.vladrabets.cinema.entities.Cinema;
import by.bsu.vladrabets.cinema.entities.Location;
import by.bsu.vladrabets.cinema.entities.MovieScoreboard;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class CinemaEndpoint {

    @WebMethod
    public Cinema getCinema() {
        return CinemaController.getCinema();
    }

    @WebMethod
    public Movie[] getAllMovies() {
        return CinemaController.getAllMovies();
    }

    @WebMethod
    public Movie[] getMovies() {
        return CinemaController.getMovies();
    }

    @WebMethod
    public Movie getMovie(@WebParam(name = "id") String id) {
        return CinemaController.getMovie(id);
    }

    @WebMethod
    public Cinema addMovieToCinema(@WebParam(name = "id") String id) {
        return CinemaController.addMovieToCinema(id);
    }

    @WebMethod
    public Movie updateMovie(@WebParam(name = "id") String id,
                             @WebParam(name = "duration") double duration) {
        return CinemaController.updateMovie(id, duration);
    }

    @WebMethod
    public boolean deleteMovie(@WebParam(name = "id") String id) {
        return CinemaController.deleteMovie(id);
    }

    @WebMethod
    public Location getLocation() {
        return CinemaController.getLocation();
    }

    @WebMethod
    public Cinema updateLocation(@WebParam(name = "latitude") String latitude,
                                 @WebParam(name = "longitude") String longitude) {
        return CinemaController.updateLocation(latitude, longitude);
    }

    @WebMethod
    public MovieScoreboard[] getScoreboard() {
        return CinemaController.getMovieScoreboard();
    }
}
