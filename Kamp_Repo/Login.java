package com.company;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        // && And
        // || Or
        // ! Not

        Scanner x = new Scanner(System.in);
        int giris_hakki = 3;
        String sys_kullanici_adi="Ozan";
        String sys_parola="123456";

        while (true) {
            System.out.println("Kullanıcı adı? ");
            String kullanici = x.nextLine();
            System.out.println("Parola? ");
            String parola=x.nextLine();

            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hoşgeldiniz " + kullanici);
                break;
            } else {
                System.out.println("Kullanıcı adı veya parola yanlış!");
                giris_hakki--;
            }

            // (!kullanici.equals(sys_kullanici_adi) || !parola.equals(sys_parola))

            if (giris_hakki==0) {
                System.out.println("Giriş hakkınız bitti!");
                break;
            }
        }
    }
}
