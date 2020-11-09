package com.company;

public class Methods {
    public static void main(String[] args) {
        // Scope -- Public, Protected, Private
        myMethod();
        //System.out.println(iki_ile_carp(5));
        //System.out.println(iki_ile_carp(iki_ile_topla(6)));
        //System.out.println(isim_yazdir("Ozan"));
        System.out.println(toplama(5,6));
        System.out.println(toplama(4,5,6));
    }
    public static void myMethod() {
        System.out.println("Method tanımlandı.");
    }
    public static void name(String myName) {
        System.out.println("Adınız: " + myName);
    }
    //Lokal ve global değişkenler
    public static int iki_ile_topla(int a){
        return a+2;
    }
    public static int iki_ile_carp(int a){
        return a*2;
    }
    public static String isim_yazdir(String isim){
        return isim;
    }

    public static int toplama(int a, int b) {
        return a+b;
    }
    
    public static double toplama(double a, double b, double c) {
        return a+b+c;
    }
    // Method Overloading--Aynı isimle birden fazla metod tanımlayabilmek.
}
