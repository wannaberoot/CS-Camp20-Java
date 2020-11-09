package com.company;

public class Main {

    public static void main(String[] args) {

    Kare kare1=new Kare("Kare1",5);
    Daire daire1=new Daire("Daire1",6);
    Sekil sekil;
    sekil=new Kare("Kare2",6);

    kare1.isminiSoyle();
    kare1.alanHesapla();
    daire1.isminiSoyle();
    daire1.alanHesapla();
    sekil.isminiSoyle();
    sekil.alanHesapla();
    }
}
