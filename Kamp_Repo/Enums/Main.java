package com.company;

public class Main {

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        //System.out.println(myVar);

        for (Level i : Level.values()) {
            System.out.println(i);
        }
    }
}
