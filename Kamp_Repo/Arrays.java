package com.company;

public class Arrays {
    public static void main(String[] args) {
        String[] names;
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] numbers = {10, 20, 30, 40};

        cars[1] = "Opel";
        /*
        System.out.println(cars[1]);
        System.out.println(numbers[2]);
        System.out.println(cars.length);
        */
        /*
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        */
        // for-each
        for (String i : cars){
            System.out.println(i);
        }

        for (int i : numbers){
            System.out.println(i);
        }

    }
}
