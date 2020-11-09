package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal myAnimal = new Animal("Any Hayvan");
	    Animal myPig = new Pig("Domuz");
	    Animal myDog = new Dog("Köpek");

	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();

	    if (myPig instanceof Pig) {
            System.out.println("It's a pig.");
        } else if (myPig instanceof Dog) {
            System.out.println("It's a dog.");
        } else {
            System.out.println("It's an another animal.");
        }
    }
}
