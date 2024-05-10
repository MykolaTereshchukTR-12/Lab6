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
    public double argumentInRadian() {
        if(realPart == 0){
            if(imagePart > 0){
                return (Math.PI/2);
            } else if (imagePart < 0) {
                return -(Math.PI/2);
            } else {
                return -1;
            }
        }

        if(imagePart == 0){
            if(realPart > 0){
                return 0;
            } else if (realPart < 0) {
                return (Math.PI);
            } else {
                return -1;
            }
        }

        if(realPart > 0){
            return (Math.atan((imagePart)/(realPart)));
        }else{
            if(imagePart > 0){
                return ((Math.atan((imagePart)/(realPart)))+(Math.PI));
            }else{
                return ((Math.atan((imagePart)/(realPart)))-(Math.PI));
            }
        }
    }
    public double argumentInDegree() {
        if(realPart == 0){
            if(imagePart > 0){
                return 90;
            } else if (imagePart < 0) {
                return -90;
            } else {
                return -1;
            }
        }

        if(imagePart == 0){
            if(realPart > 0){
                return 0;
            } else if (realPart < 0) {
                return 180;
            } else {
                return -1;
            }
        }

        if(realPart > 0){
            return (((Math.atan((imagePart)/(realPart)))*(180))/(Math.PI));
        }else{
            if(imagePart > 0){
                return ((((Math.atan((imagePart)/(realPart)))*(180))/(Math.PI))+180);
            }else{
                return ((((Math.atan((imagePart)/(realPart)))*(180))/(Math.PI))-180);
            }
        }
    }

    public String getNumber() { return "{" + realPart + " + " + imagePart + "i}"; }
    public String getModule() { return "The module of " + getNumber() + " is " + module() + "."; }
    public String getArgumentInRadian() {
        if (argumentInRadian() != (-1)) {
            return "The argument of " + getNumber() + " is " + argumentInRadian() + " in radians.";

        }else{
            return "The complex number argument is undefined.";
        }
    }
    public String getArgumentInDegree() {
        if (argumentInDegree() != (-1)) {
            return "The argument of " + getNumber() + " is " + argumentInDegree() + " in degrees.";
        }else{
            return "The complex number argument is undefined.";
        }
    }
}
