package com.company;

public class Animal {
    private String tur;

    public Animal(String tur){
        this.tur = tur;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public void animalSound() {
        System.out.println("The animal makes a sound.");
    }
}
