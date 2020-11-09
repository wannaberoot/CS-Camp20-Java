package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bakiye=1000;
        String islemler="1. Bakiye Öğrenme\n2. Para Çekme\n3. Para Yatırma\nq. Çıkış";
        System.out.println("***************");
        System.out.println(islemler);
        System.out.println("***************");

        while (true){
            System.out.print("İşlemi Seçiniz: ");
            String islem=input.nextLine();
            int tutar;

            if (islem.equals("q")){
                System.out.println("Çıkış yapılıyor...");
                return;
            }
            if (islem.equals("1")){
                System.out.println("Bakiyeniz: " + bakiye);

            }

            else if (islem.equals("2")){
                System.out.print("Çekmek istediğiniz tutar: ");
                tutar=input.nextInt();
                input.nextLine();

                if (bakiye-tutar<0){
                    System.out.println("Bakiyeniz yetersiz.");
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                }
            }

            else if (islem.equals("3")){
                System.out.println("Yatırmak istediğiniz tutar: ");
                tutar=input.nextInt();
                input.nextLine();

                bakiye+=tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);
            }

            else {
                System.out.println("Yanlış giriş yaptınız.");
            }

        }

    }
}
