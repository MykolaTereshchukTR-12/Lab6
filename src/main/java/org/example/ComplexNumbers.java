package org.example;

public class ComplexNumbers {

    private double realPart;
    private double imagePart;

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImagePart(double imagePart) {
        this.imagePart = imagePart;
    }

    public String getNumber() { return "{" + realPart + " + " + imagePart + "i}"; }

    public String getModule() { return "The module of " + getNumber() + " is " + (Math.sqrt((realPart * realPart) + (imagePart * imagePart))) + "."; }

    public String getArgument() { return "The argument of " + getNumber() + " is " + (((Math.atan((imagePart)/(realPart)))*(180))/(Math.PI)) + " in degrees."; }

}
