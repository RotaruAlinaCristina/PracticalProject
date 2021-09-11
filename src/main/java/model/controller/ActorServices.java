package model.controller;

import model.dao.Configuration;
import model.dao.Generic;
import model.dto.ActorModel;
import model.dto.ActorMovieModel;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ActorServices {

    Generic<ActorModel> genericObject = new Generic<>();

    public void addActor(ActorModel actor){
        genericObject.add(actor);


    }

}
