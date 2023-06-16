package com.js;

import java.util.ArrayList;

class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;
    private DealershipFileManager dealershipFileManager;
    private int id;


    public String getName() {
        return name;
    }public void setName(String name) {
    this.name = name;
}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(float min, float max) {
        ArrayList<Vehicle> vehiclesToDisplay = new ArrayList<>();

        for(Vehicle vehicle: this.inventory){
            if(vehicle.getPrice() > min && vehicle.getPrice() < max){
                vehiclesToDisplay.add(vehicle);
            }
        }

        return vehiclesToDisplay;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehiclesByYear(int year) {
        return new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        return new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        return new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return new ArrayList<>();
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return this.inventory;
    }

    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }

    public void removeVehicle(int vehicleIndex){
        this.inventory.remove(vehicleIndex);
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}


