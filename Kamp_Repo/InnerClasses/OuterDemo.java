package com.company;

public class OuterDemo {
    int num;

    //inner class
    private class InnerDemo {
        public void print() {
            System.out.println("This is an inner class.");
        }
    }

    void display_Inner() {
        InnerDemo inner = new InnerDemo();
        inner.print();
    }
}

class myClass {
    public static void main(String[] args) {
        OuterDemo outer = new OuterDemo();
        outer.display_Inner();
    }
}
