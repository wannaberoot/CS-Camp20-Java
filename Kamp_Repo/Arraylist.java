package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //cars.set(0, "Opel");
        //cars.remove(0);
        //System.out.println(cars.get(0));
        //cars.clear();
        //System.out.println(cars.size());

        /*
        for (int i = 0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
         */
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }



    }
}
