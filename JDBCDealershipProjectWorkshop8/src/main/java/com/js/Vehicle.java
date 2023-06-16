package com.js;

class Vehicle {
    private String make;
    private String model;
    private String color;
    private String type;
    private int year;
    private int mileage;
    private double price;
    private int id;

    public Vehicle(String make, String model, String color, String type, int year, int mileage, double price, int id) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.type = type;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.id = this.id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
}
