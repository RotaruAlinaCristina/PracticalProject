import controller.ActorMovieServices;
import controller.ActorServices;
import controller.MovieServices;
import model.dto.ActorModel;
import model.dto.MovieModel;

import java.time.Duration;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


//        ActorServices actorServices = new ActorServices();
//        actorServices.addActor(new ActorModel(
//                        "Jake Gyllenhaal",
//                        "United States Of America", LocalDate.of(1980, 12, 19)
//                )
//        );
//
//
//        MovieServices movieServices = new MovieServices();
//        movieServices.addMovie(new MovieModel(
//                "The Guilty",
//                2021,
//                "Mystery",
//                Duration.ofHours(1).plusMinutes(30)));


        ActorModel actor = new ActorModel(
                "Angelina Jolie",
                "United States Of America",
                LocalDate.of(1975, 6, 4)
        );
        MovieModel movie = new MovieModel(
                "Mr&MrsSmith",
                2005,
                "Action",
                Duration.ofHours(2).plusMinutes(6));

        ActorServices actorServices = new ActorServices();
        actorServices.addActor(actor);
        MovieServices movieServices = new MovieServices();
        movieServices.addMovie(movie);
        ActorMovieServices actorMovieServices = new ActorMovieServices();
//        actorMovieServices.addActorMovie(actor, movie);


    }
}
