package com.company;

import java.util.Scanner;

public class Main {
    //Girilen 3 sayıdan maksimum olanı bulma
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max;

        System.out.println("İlk sayıyı giriniz: ");
        int sayi1=input.nextInt();

        System.out.println("2. sayıyı giriniz: ");
        int sayi2=input.nextInt();

        System.out.println("3. sayıyı giriniz: ");
        int sayi3=input.nextInt();

        if (sayi1>sayi2 && sayi1>sayi3){
            max=sayi1;
        }

        else if (sayi2>sayi1 && sayi2>sayi3){
            max=sayi2;
        }

        else {
            max=sayi3;
        }

        System.out.println("Maksimum sayı= " + max);

    }
}
