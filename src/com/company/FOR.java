package com.company;

interface Animal {
    void displayInfo();

    void checkAge(int x);

    default void getName(String name) {
        System.out.println(name);
    }
}

class Dog implements Animal {
    @Override
    public void displayInfo() {
        System.out.println("This is a child class method! (DOG)");
    }

    @Override
    public void checkAge(int x) {
        x = 20;
        System.out.println(x);
    }
}


public class FOR {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayInfo();

    }
}