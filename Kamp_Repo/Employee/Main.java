package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        while (true) {
            String islemler = "1. Yazılımcı İşlemleri\n"
                    + "2. Yönetici İşlemleri\n"
                    + "q. Çıkış";

            System.out.println("Hoşgeldiniz..");
            System.out.println(islemler);
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            String islem = x.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {

                Yazilimci yazilimci = new Yazilimci("Ozan", 249561, 3500, "Java, Python");
                String yazılım_islemleri = "1. Bilgileri Göster\n"
                        + "2. Format At\n"
                        + "q. Yazılımcı işlemlerinden çıkış";
                while (true) {
                    System.out.println("Yazılımcı İşlemleri");
                    System.out.println(yazılım_islemleri);
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    String yazılım_islem = x.nextLine();

                    if (yazılım_islem.equals("q")) {
                        break;

                    } else if (yazılım_islem.equals("1")) {
                        yazilimci.bilgileriGoster();

                    } else if (yazılım_islem.equals("2")) {
                        System.out.print("Yüklemek istediğiniz işletim sistemi: ");
                        String isletimSistemi = x.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    } else {
                        System.out.println("Geçersiz yazılımcı işlemi girdiniz.");
                    }

                }
            } else if (islem.equals("2")) {

                Yonetici yonetici = new Yonetici("Osman", 249681, 7000, 55);
                String yonetici_islemleri = "1. Bilgileri Göster\n"
                        + "2. Zam yap\n"
                        + "q. Yönetici işlemlerinden çıkış";
                while (true) {
                    System.out.println("Yönetici İşlemleri");
                    System.out.println(yonetici_islemleri);
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    String yonetici_islem = x.nextLine();

                    if (yonetici_islem.equals("q")) {
                        break;
                    } else if (yonetici_islem.equals("1")) {
                        yonetici.bilgileriGoster();

                    } else if (yonetici_islem.equals("2")) {
                        System.out.print("Yapmak istediğiniz zam miktarı: ");
                        int zamMiktari = x.nextInt();
                        x.nextLine();
                        yonetici.zamYap(zamMiktari);
                    } else {
                        System.out.println("Geçersiz yönetici işlemi girdiniz.");
                    }

                }
            } else {
                System.out.println("Geçersiz işlem girdiniz.");
            }
        }
    }
}