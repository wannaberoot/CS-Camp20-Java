package com.company;

import java.util.Scanner;

public class Obeb {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int sayi1 = x.nextInt();
        System.out.println("İkinci sayiyi griniz: ");
        int sayi2 = x.nextInt();
        System.out.println("Üçüncü sayiyi griniz: ");
        int sayi3 = x.nextInt();
        System.out.println(obeb_bulma(sayi1, sayi2, sayi3));
    }

    public static int obeb_bulma(int sayi1, int sayi2, int sayi3){
        int obeb = 0;
        for (int i=1; i<=sayi1 && i<=sayi2; i++){
            if ((sayi1%i==0) && (sayi2%i==0) && (sayi3%i==0)){
                obeb=i;
            }
        }
        return obeb;
    }
}
