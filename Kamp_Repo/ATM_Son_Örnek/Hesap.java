package com.company;

public class Hesap {
    private String kullaniciAdi;
    private String parola;
    private double bakiye;

    public Hesap(String kullaniciAdi, String parola, double bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void paraYatir(int tutar) {
        this.bakiye += tutar;
        System.out.println("Yeni Bakiye: " + bakiye);
    }

    public void paraCekme(int tutar) {
        if (tutar > bakiye) {
            System.out.println("Bakiye yetersiz.");
        } else {
            this.bakiye -= tutar;
            System.out.println("Yeni Bakiye: " + bakiye);
        }
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
