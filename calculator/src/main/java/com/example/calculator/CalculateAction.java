package com.example.calculator;

import com.opensymphony.xwork2.ActionSupport;


public class CalculateAction extends ActionSupport {
    private int output;
    private String input;
    CalculateService cs=new CalculateService();

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
        this.setOutput(cs.evaluate(input));
        return "success";

    }
}