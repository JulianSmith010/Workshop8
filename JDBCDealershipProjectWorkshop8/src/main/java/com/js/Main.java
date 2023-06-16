package com.js;
public class Main {
    public static void main(String[]args){

        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        Dealership dealership = dealershipFileManager.getDealership();

        System.out.println(dealership);
    }
}

