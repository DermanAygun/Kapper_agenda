package model;

public class TreatmentNormal extends Treatment{

    @Override
    protected double getTotal() {
        return 10;
    }

    @Override
    public String showTreatment() {
        return "normal treatment";
    }
}
