package com.company;

public class Hayvan {
    private String tur;
    private int kilo;
    private int bacakSayisi;
    private boolean isAlive;

    public Hayvan(String tur, int kilo, int bacakSayisi, boolean isAlive) {
        this.tur = tur;
        this.kilo = kilo;
        this.bacakSayisi = bacakSayisi;
        this.isAlive = isAlive;
    }

    public void bilgileriGoster() {
        System.out.println("Tür: " + tur);
        System.out.println("Kilo: " + kilo);
        System.out.println("Bacak Sayısı: " + bacakSayisi);
        if (isAlive == true){
            System.out.println("Canlı");
        } else {
            System.out.println(":(");
        }

    }
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBacakSayisi() {
        return bacakSayisi;
    }

    public void setBacakSayisi(int bacakSayisi) {
        this.bacakSayisi = bacakSayisi;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
