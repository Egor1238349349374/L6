package com.company;

public class myClass {
    public static double Z(double x, double y) throws  MyException{
        if( y == -1) throw new MyException("Division by zero");
        return (x+y)/(y+1);
    }
}
