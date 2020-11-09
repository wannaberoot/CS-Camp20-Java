package com.company;

public class Calisan {
    private String isim;
    private int id;
    private int maas;

    public Calisan(String isim,int id,int maas){
        this.setIsim(isim);
        this.setId(id);
        this.setMaas(maas);

    }
    public void bilgileriGoster(){
        System.out.println("İsim: "+isim);
        System.out.println("Id: "+id);
        System.out.println("Maaş: "+maas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
}
