package com.company;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap) {
        Scanner input = new Scanner(System.in);
        String kullanici_adi_SYS;
        String parola_SYS;

        System.out.println("Kullanıcı Adı: ");
        kullanici_adi_SYS = input.nextLine();
        System.out.println("Parola: ");
        parola_SYS = input.nextLine();

        if (hesap.getKullaniciAdi().equals(kullanici_adi_SYS) && hesap.getParola().equals(parola_SYS)) {
            System.out.println("Giriş başarılı!");
            return true;
        } else {
            return false;
        }
    }
}
