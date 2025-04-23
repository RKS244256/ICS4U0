package Homework;

public class ScientificNotation {
    private double coefficient;
    private int exponent; 
    ScientificNotation(double coefficient, int exponent){
        while(coefficient>=10){
            coefficient /= 10;
            exponent++;
        }
        while(coefficient<1){
            coefficient *= 10;
            exponent--;
        }
        this.coefficient = coefficient;
        this.exponent = exponent;
    }
}
