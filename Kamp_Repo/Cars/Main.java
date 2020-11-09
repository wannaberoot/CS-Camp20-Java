package com.company;

public class Main {

    public static void main(String[] args) {

        Cars car1 = new Cars("Mavi", "16V", "106", 3);
        Cars car2 = new Cars("Beyaz", "18V", "Leon", 5);

        car1.bilgileriGoster();
        System.out.println("******************");
        car2.bilgileriGoster();

        System.out.println(car1.getModel());
        System.out.println(car2.getModel());
        car1.setModel("RCZ");
        car2.setModel("Spider456");
        
    }
}
