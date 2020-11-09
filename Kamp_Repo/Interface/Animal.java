package com.company;

public interface Animal {
    void animalSound();
    void sleep();
}

interface nextAnimal {
    void run();
}

class Pig implements Animal, nextAnimal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzz");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}

class myMainClass {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.sleep();
        myPig.animalSound();
        myPig.run();
    }
}