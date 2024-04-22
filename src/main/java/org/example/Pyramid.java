package org.example;

public class Pyramid extends Shape{

    private double s, h;

    public Pyramid(double s, double h, double volume) {
        super(volume);
        this.s = s;
        this.h = h;
    }

    public Pyramid(double volume) {
        super(volume);
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
