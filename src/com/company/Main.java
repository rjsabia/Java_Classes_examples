package com.company;

import com.sun.tools.corba.se.idl.constExpr.Not;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car bmw = new Car();
        Car dodge = new Car();

        // set model through class
        porsche.setModel("911 GT3");
        // get model from class
        System.out.println("Model is a " + porsche.getModel());

        bmw.setModel("M3");
        System.out.println("Model is a " + bmw.getModel());

        dodge.setModel("Hellcat");
        System.out.println("Model is " + dodge.getModel());

        // Not a recognized model test, will return un-known
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        

    }
}
