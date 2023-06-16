package com.js;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private boolean finance;

    public SalesContract(String date,
                         String customerName,
                         String customerEmail,
                         String vehicleSold,
                         double salesTaxAmount,
                         double recordingFee,
                         double processingFee,
                         boolean finance) {
        super(date,
                customerName,
                customerEmail,
                vehicleSold);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = finance;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    @Override
    public void calculateTotalPrice() {
        double totalPrice = getTotalPrice() + (getTotalPrice() * salesTaxAmount) + recordingFee + processingFee;
        setTotalPrice(totalPrice);
    }

    @Override
    public void calculateMonthlyPayment() {
        if (isFinance()) {
            if (getTotalPrice() >= 10000) {
                double monthlyPayment = (getTotalPrice() * 0.0425) / 48;
                setMonthlyPayment(monthlyPayment);
            } else {
                double monthlyPayment = (getTotalPrice() * 0.0525) / 24;
                setMonthlyPayment(monthlyPayment);
            }
        } else {
            setMonthlyPayment(0);
        }
    }
}