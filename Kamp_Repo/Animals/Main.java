package com.company;

public class Main {

    public static void main(String[] args) {
	Hayvan hayvan_x = new Hayvan("Kedi", 3, 4, true);
	Kopek kopek = new Kopek("Köpek", 5, 4, false, "Golden");

	hayvan_x.bilgileriGoster();
	System.out.println("*****************");
	kopek.bilgileriGoster();
	kopek.kos(5);
    }
}
