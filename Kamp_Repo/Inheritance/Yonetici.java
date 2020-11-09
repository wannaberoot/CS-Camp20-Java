package com.company;

public class Yonetici extends Calisan {  // Sub-Class // IS-A Consept

    private int sorumlu_oldugu_kisi_sayisi;

    public Yonetici(String isim, String departman, int maas, int sorumlu_oldugu_kisi_sayisi) {
        super(isim, departman, maas);
        this.sorumlu_oldugu_kisi_sayisi = sorumlu_oldugu_kisi_sayisi;

    }

    public void zam_yap(int miktar) {
        System.out.println("Çalışanlara " + miktar + "₺ zam yapıldı.");
    }

    public void isten_cikar(String isim) {
        System.out.println(isim + " işten çıkartıldı.");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Sorumlu olduğu kişi sayısı: " + sorumlu_oldugu_kisi_sayisi);
    }

    public int getSorumlu_oldugu_kisi_sayisi() {
        return sorumlu_oldugu_kisi_sayisi;
    }

    public void setSorumlu_oldugu_kisi_sayisi(int sorumlu_oldugu_kisi_sayisi) {
        this.sorumlu_oldugu_kisi_sayisi = sorumlu_oldugu_kisi_sayisi;
    }
}
