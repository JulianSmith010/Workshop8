package com.js;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

    public class DealershipFileManager {

        String dealershipFileLocation = "./src/main/java/com/js/dealership.txt";
        public void getDealership(){

            try {
                FileInputStream dealershipFile = new FileInputStream(dealershipFileLocation);
                Scanner scanner = new Scanner(dealershipFile);

                String firstLine_dealershipData = scanner.nextLine();
                String[] dealershipDataArr = firstLine_dealershipData.split(Pattern.quote("|"));
//                Dealership initialDealership = new Dealership();

                String vehicleData;
                while(scanner.hasNextLine()){
                    vehicleData = scanner.nextLine();
                    String[] vehicleDataArr = vehicleData.split(Pattern.quote("|"));

                    Vehicle currentVehicle = new Vehicle(
                            vehicleDataArr[0],
                            vehicleDataArr[1],
                            vehicleDataArr[2],
                            vehicleDataArr[3],
                            Integer.parseInt(vehicleDataArr[4]),
                            Integer.parseInt(vehicleDataArr[5]),
                            Double.parseDouble(vehicleDataArr[6]),
                            Integer.parseInt(vehicleDataArr[7])
                            );


//                    initialDealership.addVehicle(currentVehicle);
                }

                scanner.close();
//                return initialDealership;

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public void saveDealership(Dealership dealership) {
            try {
                FileWriter fileWriter = new FileWriter(dealershipFileLocation);
                fileWriter.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone() + "\n");

                for (Vehicle vehicle : dealership.getAllVehicles()) {
                    fileWriter.write(
                            vehicle.getId() + "|" +
                                    vehicle.getYear() + "|" +
                                    vehicle.getMake() + "|" +
                                    vehicle.getModel() + "|" +
                                    vehicle.getType() + "|" +
                                    vehicle.getColor() + "|" +
                                    vehicle.getMileage() + "|" +
                                    vehicle.getPrice() + "\n"
                    );
                }
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }

