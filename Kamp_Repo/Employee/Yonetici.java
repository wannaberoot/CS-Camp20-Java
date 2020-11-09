package com.company;

public class Yonetici extends Calisan {

    private int sorumluKisi;
    public Yonetici(String isim,int id, int maas, int sorumluKisi){
        super(isim, id, maas);
        this.setSorumluKisi(sorumluKisi);
    }

    public void zamYap(int zamMiktari){
        System.out.println(getIsim()+" isimli yönetici "+zamMiktari+" TL zam yaptı.");
    }

    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Sorumlu olduğu kişi sayısı: "+sorumluKisi);
    }

    public int getSorumluKisi() {
        return sorumluKisi;
    }

    public void setSorumluKisi(int sorumluKisi) {
        this.sorumluKisi = sorumluKisi;
    }
}
