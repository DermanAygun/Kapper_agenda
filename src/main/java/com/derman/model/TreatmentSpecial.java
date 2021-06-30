package com.derman.model;

public class TreatmentSpecial extends Treatment{
    private String info;
    private double price;

    public TreatmentSpecial(String info, double price) {
        this.info = info;
        this.price = price;
    }

    @Override
    protected double getTotal() {
        return 10 + price;
    }

    @Override
    public String showTreatment() {
        return "special treatment due: " + info;
    }

    public double getPrice() {
        return price;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
