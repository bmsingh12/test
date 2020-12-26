package com.company;

public class Main {

    public static void main(String[] args) {
        func();
        int x = func(30);
    }

    private static void func() {
        int x = 20;
        System.out.println("Value of x in func without param: " + x);
    }

    static int func(int x) {
        System.out.println("Value of x in func with param: " + x);
        return x;
    }
}
