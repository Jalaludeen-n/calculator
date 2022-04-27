package com.example.calc;

import com.example.calc.model.Data;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculateAction extends ActionSupport {
    private int output;
    private String input;

    @Autowired
    CalculateService calculateService;

    public DataServiceImpl getDataService() {
        return dataService;
    }

    public void setDataService(DataServiceImpl dataService) {
        this.dataService = dataService;
    }

    @Autowired
    DataServiceImpl dataService;


    public CalculateService getCalculateService() {
        return calculateService;
    }

    public void setCalculateService(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    public void setOutput(int result) {
        this.output = result;
    }

    public int getOutput() {
        return output;
    }


    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }


    public String execute() {
        int ans = calculateService.evaluate(input);
        this.setOutput(ans);
        Data data = new Data();
        data.setAnswer(String.valueOf(ans));
        data.setQuestion(String.valueOf(input));
        dataService.save(data);
        return "success";

    }
}