package com.company;

public class Calisan { // Super Class
    private String isim;
    private String departman;
    private int maas;

    public Calisan(String isim, String departman, int maas) {
        this.isim = isim;
        this.departman = departman;
        this. maas = maas;
    }

    public void bilgileriGoster() {
        System.out.println("İsim: " + isim);
        System.out.println("Departman: " + departman);
        System.out.println("Maaş: " + maas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
}
