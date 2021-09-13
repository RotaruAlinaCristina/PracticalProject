package controller;

import model.dao.Generic;
import model.dto.ActorModel;
import model.dto.MovieModel;

public class MovieServices {
    Generic<MovieModel> genericObject = new Generic<>();

    private MovieModel movie = new MovieModel();

    public void addMovie(MovieModel movie){

        genericObject.add(movie);
    }

     public MovieModel searchMovieByName(String movieName){

        MovieModel foundMovie = genericObject.searchByName(movieName, movie );

        if(foundMovie != null){
            System.out.println(foundMovie);

        }else{
            System.out.println("Sorry we couldn't find anything");
        }

        return foundMovie;
    }
}
