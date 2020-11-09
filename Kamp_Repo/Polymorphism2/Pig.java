package com.company;

public class Pig extends Animal{

    public Pig(String tur){
        super(tur);
    }

    public void animalSound() {
        System.out.println(getTur() + "The pig says: wee wee");
    }
}
