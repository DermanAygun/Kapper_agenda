package model;

public class TreatmentSpecial extends Treatment{
    private String info;

    @Override
    protected double getTotal() {
        return super.getPrice() + 10;
    }

    @Override
    public String showTreatment(String text) {
        return "special treatment due: " + info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
