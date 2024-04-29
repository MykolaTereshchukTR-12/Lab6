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
    public double getRealPart() { return realPart; }
    public double getImagePart() { return imagePart; }

    public double module() { return (Math.sqrt((realPart * realPart) + (imagePart * imagePart))); }
    public double argumentInRadian() { return (Math.atan((imagePart)/(realPart))); }
    public double argumentInDegree() { return (((Math.atan((imagePart)/(realPart)))*(180))/(Math.PI)); }

    public String getNumber() { return "{" + realPart + " + " + imagePart + "i}"; }
    public String getModule() { return "The module of " + getNumber() + " is " + module() + "."; }
    public String getArgumentInRadian() { return "The argument of " + getNumber() + " is " + argumentInRadian() + " in degrees."; }
    public String getArgumentInDegree() { return "The argument of " + getNumber() + " is " + argumentInDegree() + " in degrees."; }

}
