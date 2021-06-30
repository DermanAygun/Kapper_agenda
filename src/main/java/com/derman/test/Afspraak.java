package com.derman.test;

public class Afspraak {
    private String naam;
    private String mail;
    private String phone;
    private boolean isFilled = false;
    private boolean toMail = false;
    private boolean toPhone = false;

    public Afspraak(String naam){
        this.naam = naam;
    }

    public Afspraak(String naam, String contact) {
        this.naam = naam;
        if (!contact.contains("@")) {
            this.phone = contact;
        } else {
            this.mail = contact;
        }
    }

    public boolean confirm() {
        if (naam != null) {
            isFilled = true;
        }
        if (mail != null) {
            toMail = true;
        }
        if (phone != null) {
            toPhone = true;
        }

        if (isFilled) {
            return toMail || toPhone;
        } else {
            return false;
        }
    }

    public String getNaam() {
        return naam;
    }
}
