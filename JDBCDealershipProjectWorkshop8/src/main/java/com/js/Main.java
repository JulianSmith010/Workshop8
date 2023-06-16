package com.js;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

public class Main {
    public static void main(String[]args){

//        DealershipFileManager dealershipFileManager = new DealershipFileManager();
//        Dealership dealership = dealershipFileManager.getDealership();
        BasicDataSource basicDataSource = new BasicDataSource();
        String username = args[0];
        String password = args[1];
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/dealership?reconnect=true");

        DealershipDataManager dealershipDataManager = new DealershipDataManager(basicDataSource);

        List<Dealership> dealershipsList = dealershipDataManager.getAll();
        System.out.println(dealershipsList);
    }
}

