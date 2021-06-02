package model;

public class TreatmentNormal extends Treatment{

    @Override
    protected double getTotal() {
        return super.getPrice();
    }

    @Override
    public String showTreatment(String text) {
        return "normal treatment";
    }
}
