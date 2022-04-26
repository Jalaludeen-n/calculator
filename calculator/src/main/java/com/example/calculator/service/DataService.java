package com.example.calculator.service;

import com.example.calculator.model.Data;

import java.util.List;

public interface DataService {
    public void save(Data data);
    public List<Data> list();
}
