package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.print(myClass.Z(2,-1));
        }
        catch (MyException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
