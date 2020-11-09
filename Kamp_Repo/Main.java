package com.company;

public class Main {

    public static void main(String[] args) {

        // == eşit mi?
        // != eşit değil mi?
        // > büyük mü
        // < küçük mü?
        // >= büyük eşit mi?
        // <= küçük eşit mi?
        // +, -, *, /
        // % kalan
        int kalan = 20%6;
        int toplama = 5+5;
        int cikarma = 7-5;
        int carpma = 7*3;
        int bolme = 14/2;
        /*
        String txt = "Hello World";
        System.out.println(txt.toLowerCase());
        */
        /*
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        */

        /*
        boolean dersVerimliMi = false;
        System.out.println(dersVerimliMi);
         */

        /*
        int x = 10;
        int y =9;

        System.out.println(x != y);
         */

        /*
        if (condition) {
            // Bu durumda çalışacak kodlar
        }
         */

        //int time = 8;
        /*
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good night.");
        }
         */

        /*
        switch(expression) {
            case x:
                // code block
                break;
             case y:
                // code block
                break;
             default:
                // code block
         */
        /*
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("7 Tane Gün var");
         */

        /*
        while (condition) {
            //code
        }
         */

        // ++ Arttırıyor 1 Birim
        // -- Azaltıyor 1 Birim
        /*
        int i = 0;
        while (i<6) {
            System.out.println(i);
            i++;
        }

         */
        /*
        do {
            System.out.println(i);
            i++;
        } while (i<6);
         */

        /*
        for (statement 1; statement 2; statement 3){
            //code
        }
         */

        // Statement 1 kod bloğu çalışmadan önce 1 kere çalışır
        // Statement 2 kod bloğunun şartını belirliyor
        // Statement 3 kod bloğu her çalıştığında çalışıyor
        /*
        for (int x = 0; x<6; x++){
            System.out.println(x);
        }
        */
        // break
        // continue

        int i =0;
        while (i < 10){
            System.out.println(i);
            i++;
            if (i==4) {
                continue;
            }
        }
    }
}
