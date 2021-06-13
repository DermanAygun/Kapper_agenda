package model;

public abstract class Treatment {
    protected abstract double getTotal();
    protected abstract String showTreatment();

    public double getPrice() {
        return getTotal();
    }
    public String getInfo() {
        return showTreatment();
    }

}
