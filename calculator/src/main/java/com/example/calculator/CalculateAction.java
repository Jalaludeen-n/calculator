package com.example.calculator;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculateAction extends ActionSupport {
    private int output;
    private String input;




    @Autowired
    CalculateService calculateService;



    public CalculateService getCalculateService() {
        return calculateService;
    }

    public void setCalculateService(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    public void setOutput(int result) {
        this.output = result;
    }
    public int getOutput(){
        return output;
    }


    public void setInput(String input) {
        this.input = input;
    }
    public String getInput(){
        return input;
    }


    public String execute(){
        int ans = calculateService.evaluate(input);
        this.setOutput(ans);
        return "success";

    }
}