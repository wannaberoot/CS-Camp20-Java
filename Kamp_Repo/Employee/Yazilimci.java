package com.company;

public class Yazilimci extends Calisan {

    private String diller;
    public Yazilimci(String isim,int id,int maas,String diller){
        super(isim,id,maas);
        this.setDiller(diller);
    }
    public void formatAt(String isletimSistemi){
        System.out.println(getIsim()+" isimli yazılımcı "+isletimSistemi+" işletim sistemini kuruyor...");
    }

    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Bildiği diller: "+diller);
    }

    public String getDiller() {
        return diller;
    }

    public void setDiller(String diller) {
        this.diller = diller;
    }
}
