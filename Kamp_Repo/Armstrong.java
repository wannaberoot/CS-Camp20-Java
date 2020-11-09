package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int basamak=0;

        Scanner x=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=x.nextInt();
        int gecici=sayi;

        while ((gecici/10)>=1) {
            gecici=gecici/10;
            basamak++;

        }
        basamak++;

        int toplam=0;

        int gecici2=sayi;
        do{
            int basamak_degeri=gecici2%10;
            gecici2 /= 10;
            toplam+=Math.pow(basamak_degeri,basamak);
        }while (gecici2>0);

        if (sayi==toplam){
            System.out.print("Girdiğiniz sayı armstrong sayısıdır.");
        }

        else {
            System.out.println("Girdiğiniz sayı armstrong sayısı değildir.");
        }

    }
}
