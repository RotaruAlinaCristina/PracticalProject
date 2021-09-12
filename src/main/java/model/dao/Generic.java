package model.dao;

import model.dao.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Generic<T> {
    public void add(T object) {
        try (Session session = Configuration.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public List<T> getObjectList(){
//        try (Session session = Configuration.getSessionFactory().openSession()) {
//            session.createQuery("SELECT name from MovieModel where ")
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
