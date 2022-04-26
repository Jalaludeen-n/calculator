package com.example.calculator.respository;
import com.example.calculator.model.Data;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class DataDAOImpl implements DataDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Data data) {
        sessionFactory.getCurrentSession().save(data);
    }
    @Override
    public List<Data> list() {
        return sessionFactory.getCurrentSession().createCriteria(Data.class).list();
    }
}
