package com.example.calc;

import com.example.calc.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class DataServiceImpl  {
    public DataDAOImpl getDao() {
        return dao;
    }

    public void setDao(DataDAOImpl dao) {
        this.dao = dao;
    }

    private DataDAOImpl dao;

    public void save(Data data) {
        dao.save(data);
    }
//    public List<Data> list() {
//        return dao.list();
//    }
}
