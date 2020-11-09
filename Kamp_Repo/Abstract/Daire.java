package com.company;

public class Daire extends Sekil {

    private int yaricap;
    public Daire(String isim,int yaricap){
        super(isim);
        this.yaricap=yaricap;

    }

    void alanHesapla(){
        System.out.println(getIsim()+" Alan: "+(Math.PI*yaricap*yaricap));
    }
}
