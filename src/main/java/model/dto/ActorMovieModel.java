package model.dto;

import javax.persistence.*;

@Entity
@Table(name = "actor_movie")
public class ActorMovieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private ActorModel actor;

    @ManyToOne
    private MovieModel movie;


    public ActorMovieModel(ActorModel actor, MovieModel movie) {
        this.actor = actor;
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "ActorMovieModel{" +
                "id=" + id +
                ", actor=" + actor +
                ", movie=" + movie +
                '}';
    }
}
