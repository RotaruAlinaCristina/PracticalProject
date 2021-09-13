package view.ui;

import controller.MovieServices;
import model.dao.Configuration;
import model.dto.MovieModel;
import model.dto.RatingModel;
import model.dto.UserModel;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieUi {

        MovieServices movieServices = new MovieServices();

    public void viewHomeMenu(UserModel user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Top Movies");
        System.out.println("Enter 2 for New Movies");
        System.out.println("Enter 3 to search an actor");
        System.out.println("Enter 4 to search a movie");
        int choice = scanner.nextInt();
        switch(choice){
            case 4:{
                System.out.println("Enter the name of the movie: ");
                String movieName = scanner.next();
                MovieModel movie = movieServices.searchMovieByName(movieName);
                System.out.println("Enter 1 if you want to rate this movie: ");
                System.out.println("Enter 2 if you want to write a review: ");
                int option = scanner.nextInt();
                switch(option){
                    case 1:{
                        System.out.println("Please rate from 1 to 5 stars");
                        int stars = scanner.nextInt();
                        RatingModel rating = new RatingModel(stars, user, movie);
                        List<RatingModel> ratings = new ArrayList<>();
                        ratings.add(rating);
                        movie.setRating(stars);
                        movie.setRatings(ratings);
                        try (Session session = Configuration.getSessionFactory().openSession()) {
                            Transaction transaction = session.beginTransaction();
                            session.save(rating);
                            transaction.commit();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
