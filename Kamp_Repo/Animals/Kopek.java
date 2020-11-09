package com.company;

public class Kopek extends Hayvan {
    private String cins;

    public Kopek(String tur, int kilo, int bacakSayisi, boolean isAlive, String cins) {
        super(tur,kilo,bacakSayisi,isAlive);
        this.cins = cins;
    }

    public void kos(int hiz) {
        System.out.println("Köpek " + hiz + " km/h hız ile koşuyor");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Cins: " + cins);
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }
}
