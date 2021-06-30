package com.derman.test;

public class Behandeling {
    private Integer aantal;

    public Behandeling(Integer aantal) {
        this.aantal = aantal;
    }

    public double getPrijs(int leeftijd, boolean birthday) {
        double totaal = 0.00;
        int korting = 0;
        double verjaardagKorting = 0;

        if (leeftijd > 0 && leeftijd <= 6) {
            korting = 40;
        }
        if (leeftijd > 6 && leeftijd <= 14) {
            korting = 20;
        }

        for (int i = 1; i <= this.aantal; i++) {
            if (i == 1) {
                totaal += 10.00;
            }
            if (i == 2) {
                totaal += 5.00;
            }
            if (i > 2) {
                totaal += 4.00;
            }
        }

        if (leeftijd > 0 && leeftijd <= 6 && birthday) {
            korting = 100;
        }
        if (leeftijd > 6 && leeftijd <= 14 && birthday) {
            verjaardagKorting = 5;
        }
        if (leeftijd > 14 && birthday) {
            verjaardagKorting = 5;
        }

        return totaal / 100 * korting + verjaardagKorting;
    }

    public void setAantal(Integer aantal) {
        this.aantal = aantal;
    }
    public Integer getAantal() {
        return aantal;
    }
}
