package org.example;

public abstract class Car {

    private String model;
    private String color;
    private int maxSpeed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String gas() {
        return "Chased! And let the wind blow at your back!";
    }

    public String brake() {
        return "We arrived, Sam... And where were you looking?!";
    }
}
