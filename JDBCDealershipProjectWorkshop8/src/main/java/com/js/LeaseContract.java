package com.js;

public class LeaseContract extends Contract {
    private double expectedEndingValue;
    private double leaseFee;

    public LeaseContract(String date,
                         String customerName,
                         String customerEmail,
                         String vehicleSold,
                         double expectedEndingValue,
                         double leaseFee) {
        super(date,
                customerName,
                customerEmail,
                vehicleSold);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    public void calculateTotalPrice() {
        double totalPrice = getTotalPrice() - expectedEndingValue + leaseFee;
        setTotalPrice(totalPrice);
    }

    @Override
    public void calculateMonthlyPayment() {
        double monthlyPayment = (getTotalPrice() * 0.04) / 36;
        setMonthlyPayment(monthlyPayment);
    }
}