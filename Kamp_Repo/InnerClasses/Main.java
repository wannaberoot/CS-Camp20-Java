package com.company;

public class Main {

    public static void main(String[] args) {
	    // Inner or Nest Classes
        // Amacı class'ları gruplamak, kodu okunabilir hale getirmek

        /*OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();*/
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);

    }
}

class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}