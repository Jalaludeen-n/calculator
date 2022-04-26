package com.example.calculator.respository;

import com.example.calculator.model.Data;

import java.util.List;

public interface DataDAO {
    public void save(Data data);
    public List<Data> list();
}
