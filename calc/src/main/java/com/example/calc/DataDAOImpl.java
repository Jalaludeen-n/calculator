package com.example.calc;

import com.example.calc.model.Data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class DataDAOImpl {


    SessionFactory sessionFactory;

    public void save(Data data) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.getTransaction().begin();
        currentSession.merge(data);
        currentSession.getTransaction().commit();
    }
//    public List<Data> list() {
//        return sessionFactory.getCurrentSession().createCriteria(Data.class).list();
//    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
