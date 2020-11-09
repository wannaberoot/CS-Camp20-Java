package com.company;

public class Dog extends Animal{

    public Dog(String tur){
        super(tur);
    }

    public void animalSound() {
        System.out.println(getTur()+ " says: bow bow");
    }
}
