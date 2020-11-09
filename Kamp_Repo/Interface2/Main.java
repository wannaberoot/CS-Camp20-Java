package com.company;

public class Main {

    public static void main(String[] args) {

    IMuhendis muhendis1=new PcMuhendis(false,false);
    muhendis1.adliSicil();
    muhendis1.askerlikDurumu();
    System.out.println("Ortalama: "+muhendis1.ortalama(3.10));
    String[] tecrube={"Vestel","TAI","Mercedes"};
    muhendis1.isTecrubesi(tecrube);
        System.out.println("");

    MakineMuhendisi muhendis2=new MakineMuhendisi(true,false);
    muhendis2.adliSicil();
    muhendis2.askerlikDurumu();
    System.out.println("Ortalama: "+muhendis2.ortalama(2.30));
    String[] tecrube2={};
    String[] referans={"Ozan Şahin","Furkan Yıldırım"};
    muhendis2.isTecrubesi(tecrube2);
    muhendis2.referansGetir(referans);
    muhendis2.calis();
    }
}
