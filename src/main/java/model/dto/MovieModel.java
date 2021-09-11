package model.dto;

import javax.persistence.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movie", uniqueConstraints={@UniqueConstraint(columnNames={"name"})})
public class MovieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name = "year")
    private int year;

    @Column(name = "genre")
    private String genre;

    @Column(name = "duration")
    private Duration duration;

    @OneToMany(mappedBy = "movie",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ReviewModel> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "movie",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<RatingModel> ratings = new ArrayList<>();

    @OneToMany(mappedBy = "movie",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ActorMovieModel> movies = new ArrayList<>();

    public MovieModel(String name, int year, String genre, Duration duration) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
    }

    public MovieModel() {
    }

    public int getId() {
        return id;
    }

    public MovieModel setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public MovieModel setName(String name) {
        this.name = name;
        return this;
    }

    public int getYear() {
        return year;
    }

    public MovieModel setYear(int year) {
        this.year = year;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public MovieModel setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public Duration getDuration() {
        return duration;
    }

    public MovieModel setDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    public List<ReviewModel> getReviews() {
        return reviews;
    }

    public MovieModel setReviews(List<ReviewModel> reviews) {
        this.reviews = reviews;
        return this;
    }

    public List<RatingModel> getRatings() {
        return ratings;
    }

    public MovieModel setRatings(List<RatingModel> ratings) {
        this.ratings = ratings;
        return this;
    }


    @Override
    public String toString() {
        return "MovieModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                '}';
    }
}
