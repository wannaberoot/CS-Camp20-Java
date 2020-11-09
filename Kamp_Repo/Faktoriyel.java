package com.company;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        faktoriyel();

    }
    public static void faktoriyel(){
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyelini almak istediğiniz sayıyı giriniz: ");
        int a = input.nextInt();
        int faktoriyel=1;

        while (a>0) {
            //faktoriyel = faktoriyel*a;
            //faktoriyel += a;
            faktoriyel *= a;
            a--;
        }
        System.out.println(faktoriyel);
    }
}
