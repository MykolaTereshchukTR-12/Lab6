package org.example;

import java.text.MessageFormat;

public class Truck extends Car{

    private int carryingCapacity;
    private String bodyType;

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String body) {
        this.bodyType = body;
    }

    public String getInfo() {
        return "Model " + getModel() + " truck is " + getColor() + " in color and has a maximum speed of " + getMaxSpeed() + " km/h.";
    }

    public String cargo() {
        return MessageFormat.format("The model {0} truck has a carrying capacity of {1} tons, and the body type is {2}.", getModel(), getCarryingCapacity(), getBodyType());
    }
}
