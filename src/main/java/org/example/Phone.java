package org.example;

import java.util.Arrays;

public class Phone {

    private int number;
    private String model;
    private int weight;

    public int getNumber() {
        return number;
    }

    public void setNumber(int _number) {
        this.number = _number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String _model) {
        this.model = _model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int _weight) {
        this.weight = _weight;
    }

    public Phone(int _number, String _model, int _weight) {
        this.number = _number;
        this.model = _model;
        this.weight = _weight;
    }

    public Phone(int _number, String _model) {
        this.number = _number;
        this.model = _model;
    }

    public Phone(){}

    public String receiveCall(String _fullName){
        return _fullName + " is calling you. ";
    }

    public String receiveCall(String _fullName, int _number) {
        return _fullName + " is calling you, his number is " + _number + ".";
    }

    public String sendMessage(int... _number){
        return Arrays.toString(_number);
    }
}
