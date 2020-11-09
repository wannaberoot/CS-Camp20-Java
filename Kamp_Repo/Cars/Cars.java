package com.company;

public class Cars {
    private String renk;
    private String motor;
    private String model;
    private int kapiSayisi;

    public Cars(String renk, String motor, String model, int kapiSayisi) {
        this.renk = renk;
        this.motor = motor;
        this.model = model;
        this.kapiSayisi = kapiSayisi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public void bilgileriGoster() {
        System.out.println(renk);
        System.out.println(motor);
        System.out.println(model);
        System.out.println(kapiSayisi);
    }
}
