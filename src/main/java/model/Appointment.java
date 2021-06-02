package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Appointment {
    private String name;
    private int code;
    private LocalDate date;
    private LocalTime time;

    private Login loggedInUser = Login.getInstance();
    private Treatment hasTreatment = null;

    ArrayList<Appointment> appointmets = new ArrayList<>();

    public Appointment(String name, int code, LocalDate date, LocalTime time) {
        this.name = name;
        this.code = code;
        this.date = date;
        this.time = time;
        appointmets.add(this);
    }

    public Appointment(String name, int code, LocalDate date, LocalTime time, Treatment hasTreatment) {
        this.name = name;
        this.code = code;
        this.date = date;
        this.time = time;
        this.hasTreatment = hasTreatment;
        appointmets.add(this);
    }

    public void updateAppointment(String name, int code, LocalDate date, LocalTime time) {
        this.setName(name);
        this.setCode(code);
        this.setDate(date);
        this.setTime(time);
    }

    public void updateAppointment(String name, int code, LocalDate date, LocalTime time, Treatment hasTreatment) {
        this.setName(name);
        this.setCode(code);
        this.setDate(date);
        this.setTime(time);
        this.setHasTreatment(hasTreatment);
    }

    public void showAppointment() {
        System.out.println(this.toString());
    }

    public void deleteAppointment() {
        appointmets.remove(this);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", date=" + date +
                ", time=" + time +
                ", hasUser=" + loggedInUser +
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

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Treatment getHasTreatment() {
        return hasTreatment;
    }

    public void setHasTreatment(Treatment hasTreatment) {
        this.hasTreatment = hasTreatment;
    }
}
