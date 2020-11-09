package com.company;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Ozan", "123456", 500);
        atm.run(hesap);
    }
}
