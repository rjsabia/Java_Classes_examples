package com.company;


public class Car {


    // state component variable, also known as fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();

        if(validModel.equals("911 gt3") || validModel.equals("m3") || validModel.equals("hellcat")) {

            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
