package com.example.calculator.service;

import com.example.calculator.model.Data;
import com.example.calculator.respository.DataDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataDAO dataDAO;
    @Override
    public void save(Data employee) {
        dataDAO.save(employee);
    }
    @Override
    public List<Data> list() {
        return dataDAO.list();
    }
}
