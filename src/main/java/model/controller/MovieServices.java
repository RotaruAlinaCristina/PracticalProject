package model.controller;

import model.dao.Generic;
import model.dto.ActorModel;
import model.dto.MovieModel;

public class MovieServices {
    Generic<MovieModel> genericObject = new Generic<>();

    public void addMovie(MovieModel movie){

        genericObject.add(movie);
    }
}
