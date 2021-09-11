package model.controller;

import model.dao.Configuration;
import model.dao.Generic;
import model.dto.ActorModel;
import model.dto.ActorMovieModel;
import model.dto.MovieModel;
import org.hibernate.Session;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

public class ActorMovieServices {
    Generic<ActorMovieModel> genericObject = new Generic<>();

    public void addActorMovie(int actorId, int movieId) {
//
////        ActorMovieModel actorMovie = new ActorMovieModel(actor, movie);
//        genericObject.add(actorMovie);
    }
}

// Artist newArtist = session.get(Artist.class,1l);

