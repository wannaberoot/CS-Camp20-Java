package com.company;

public class Main {

    public static void main(String[] args) {
        Calisan calisan_x = new Calisan("Ozan", "IT", 3100);
        Yonetici yonetici = new Yonetici("Ahmet", "Kaya", 10000, 100);

        calisan_x.bilgileriGoster();
        System.out.println("****************");
        yonetici.bilgileriGoster();
        yonetici.zam_yap(500);
        yonetici.isten_cikar("Ozan");
    }
}
