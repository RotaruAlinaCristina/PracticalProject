package view.ui;

import controller.UserServices;
import model.dao.Configuration;
import model.dto.UserDetailModel;
import model.dto.UserModel;
import org.hibernate.Session;

import java.util.List;
import java.util.Scanner;

public class UserUi {

    public static void logIn() {

        System.out.println("Enter 1 for registration");
        System.out.println("Enter 2 for Log in, if you already an account");

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int choice = scanner.nextInt();

        UserServices userServices = new UserServices();

        switch (choice) {
            case 1: {
                Scanner sc = new Scanner(System.in).useDelimiter("\n");
                System.out.println("Enter e-mail");
                String email = sc.next();
                System.out.println("Enter password");
                String password = sc.next();
                System.out.println("Enter country");
                String country = sc.next();
                System.out.println("Enter age");
                int age = sc.nextInt();
                System.out.println("Enter gender ");
                String gender = sc.next();
                System.out.println("Your data are being saved");
                UserDetailModel userDetail = new UserDetailModel(country, age, gender);
                UserModel user = new UserModel(email, password, userDetail);
                userServices.addUser(user);
                break;
            }
            case 2: {
                boolean var = false;
                while (!var) {
                    Scanner sc = new Scanner(System.in).useDelimiter("\n");
                    System.out.println("Enter e-mail");
                    String email = sc.next();
                    System.out.println("Enter password");
                    String password = sc.next();
                    var = isUserDataValid(email, password);
                }
                break;
            }

        }

    }

    public static boolean isUserDataValid(String email, String password) {
        try (Session session = Configuration.getSessionFactory().openSession()) {
            List<UserModel> users = session.createQuery("SELECT u FROM UserModel u").getResultList();
            for (UserModel user : users) {
                if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
