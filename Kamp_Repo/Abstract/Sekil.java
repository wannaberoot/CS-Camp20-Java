package com.company;

public abstract class Sekil {

    private String isim;

    public Sekil(String isim){
        this.isim=isim;
    }

    abstract void alanHesapla();

    public void isminiSoyle(){
        System.out.println("Bu şeklin ismi: "+isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
