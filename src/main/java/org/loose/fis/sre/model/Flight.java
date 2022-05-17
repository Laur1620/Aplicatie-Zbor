package org.loose.fis.sre.model;

import org.dizitart.no2.objects.Id;

import java.util.Date;

public class Flight {

    @Id
    private int flight_id;
    private String locul_plecare;
    private String locul_sosire;
    private Date data;
    private int nr_maxim;

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public Flight(int flight_id, String locul_plecare, String locul_sosire, Date data, int nr_maxim) {
        this.flight_id = flight_id;
        this.locul_plecare = locul_plecare;
        this.locul_sosire = locul_sosire;
        this.data = data;
        this.nr_maxim = nr_maxim;
    }

    public Flight(){

    }

    public String getLocul_plecare() {
        return locul_plecare;
    }

    public void setLocul_plecare(String locul_plecare) {
        this.locul_plecare = locul_plecare;
    }

    public String getLocul_sosire() {
        return locul_sosire;
    }

    public void setLocul_sosire(String locul_sosire) {
        this.locul_sosire = locul_sosire;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNr_maxim() {
        return nr_maxim;
    }

    public void setNr_maxim(int nr_maxim) {
        this.nr_maxim = nr_maxim;
    }
}
