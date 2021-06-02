package model;

public abstract class Treatment {
    private String name;
    private double price;

    protected abstract double getTotal();
    protected abstract String showTreatment(String text);

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
