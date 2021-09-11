package model.dao;

import model.dao.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
}
