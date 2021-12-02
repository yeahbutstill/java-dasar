package com.yeahbutstill.javadasar.method.overloading;

public class KodeMethodOverloadings {
    public static void main(String[] args) {
        sayHello();
        sayHello("Dani");
        sayHello("Maya", "Triyanti");
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    public static void sayHello(String firstName, String lasName) {
        System.out.println("Hello " + firstName + " " + lasName);
    }
}
