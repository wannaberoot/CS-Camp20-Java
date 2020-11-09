package com.company;

import java.util.Scanner;

public class Age_Control {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı girin: ");
        int yas = input.nextInt();

        if (yas < 18) {
            System.out.println("Bu mekana giremezsiniz.");
        } else {
            System.out.println("Hoşgeldiniz.");
        }
    }
}
