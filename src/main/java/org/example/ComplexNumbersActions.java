package org.example;

public class ComplexNumbersActions extends ComplexNumbers{

    private double real;
    private double image;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public String getSumTwoNum(double realPart1, double imagePart1, double realPart2, double imagePart2) { return "The sum of {" + realPart1 + " + " + imagePart1 + "i} " +
            "and " + "{" + realPart2 + " + " + imagePart2 + "i} is " + "{" + (realPart1+realPart2) + " + " + (imagePart1+imagePart2) + "i}."; }

    public String getDifTwoNum(double realPart1, double imagePart1, double realPart2, double imagePart2) { return "The difference of {" + realPart1 + " + " + imagePart1 + "i} " +
            "and " + "{" + realPart2 + " + " + imagePart2 + "i} is " + "{" + (realPart1-realPart2) + " + " + (imagePart1-imagePart2) + "i}."; }

    public String getMulTwoNum(double realPart1, double imagePart1, double realPart2, double imagePart2) { return "The multiplication of {" + realPart1 + " + " + imagePart1 + "i} " +
            "and " + "{" + realPart2 + " + " + imagePart2 + "i} is " + "{" + ((realPart1*realPart2)-(imagePart1*imagePart2)) + " + " + ((imagePart1*realPart2)+(imagePart2*realPart1)) + "i}."; }

    public String getDivTwoNum(double realPart1, double imagePart1, double realPart2, double imagePart2) {
        if((realPart2*realPart2 + imagePart2*imagePart2) != 0){
            return "The division of {" + realPart1 + " + " + imagePart1 + "i} " +
                    "and " + "{" + realPart2 + " + " + imagePart2 + "i} is " + "{" + (((realPart1*realPart2)+(imagePart1*imagePart2))/(realPart2*realPart2 + imagePart2*imagePart2)) +
                    " + " + (((imagePart1*realPart2)-(imagePart2*realPart1))/(realPart2*realPart2 + imagePart2*imagePart2)) + "i}.";
        } else {
            return "A complex number cannot be divided by zero.";
        }
    }
}
