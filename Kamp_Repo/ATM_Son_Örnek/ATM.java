package com.company;

import java.util.Scanner;

public class ATM {
    public void run(Hesap hesap) {
        Login loginProcess = new Login();
        Scanner input = new Scanner(System.in);

        System.out.println("Bankamıza Hoşgeldiniz");
        System.out.println("*********************");
        System.out.println("Lütfen giriş yapınız.");
        System.out.println("*********************");

        int girisHakki = 3;

        while (true) {
            if (loginProcess.login(hesap) == true){
                break;
            }
            else if (girisHakki == 0) {
                System.out.println("3 giriş hakkınız dolmuştur. Hesap bloke edildi.");
                return;
            }
            else {
                System.out.println("Giriş başarısız. Tekrar deneyiniz.");
                girisHakki--;
                System.out.println("Kalan giriş hakkı: " + girisHakki);
            }
        }

        System.out.println("***************");
        String islemler = "1. Bakiye Sorgulama\n"
                + "2. Para Yatırma\n"
                + "3. Para Çekme\n"
                + "Çıkış için q'ya basınız.";

        System.out.println(islemler);
        System.out.println("***************");

        while (true) {
            System.out.println("İşlemi Seçiniz");
            String islem = input.nextLine();

            if (islem.equals("q")) {
                System.out.println("Hesaptan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + hesap.getBakiye() + "₺");
            } else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar = input.nextInt();
                input.nextLine();

                hesap.paraYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.println("Çekmek istediğiniz tutar: ");
                int tutar = input.nextInt();
                input.nextLine();

                hesap.paraCekme(tutar);
            } else {
                System.out.println("Geçersiz tuşlama.");
            }
        }
    }
}
