package com.derman.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Appointment {
    private String name;
    private int code;
    private LocalDate date;
    private String time;

    private Login hasUser;
    private Treatment hasTreatment = null;

    public static ArrayList<Appointment> appointments = new ArrayList<>();

    public Appointment(String name, LocalDate date, String time, Treatment hasTreatment) {
        this.hasUser = Login.getInstance();
        this.name = name;
        this.code = 0;
        this.date = date;
        this.time = time;
        this.hasTreatment = hasTreatment;
        appointments.add(this);
    }

    public void updateAppointment(String name, LocalDate date, String time, Treatment hasTreatment) {
        this.setName(name);
        this.setDate(date);
        this.setTime(time);
        this.setHasTreatment(hasTreatment);
    }

    public void showAppointment() {
        System.out.println(this.toString());
    }

    public void deleteAppointment() {
        appointments.remove(this);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", date=" + date +
                ", time=" + time +
                ", hasUser=" + hasUser +
                ", hasTreatment=" + hasTreatment +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Treatment getHasTreatment() {
        return hasTreatment;
    }

    public void setHasTreatment(Treatment hasTreatment) {
        this.hasTreatment = hasTreatment;
    }
}
