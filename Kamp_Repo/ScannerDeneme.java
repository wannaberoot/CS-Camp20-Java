package com.company;

import java.util.Scanner;

public class ScannerDeneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Adınız nedir? ");
        String name = input.nextLine();

        System.out.println("Hoşgeldin " + name);

        System.out.println("Kilonuz? ");
        int kilo = input.nextInt();

        System.out.println("Boyunuz? ");
        float boy = input.nextFloat();

        // BKİ = kilo/(boy*boy)
        float bki = kilo/(boy*boy);
        System.out.println("Beden kitle endeksiniz: " + bki);
    }
}
