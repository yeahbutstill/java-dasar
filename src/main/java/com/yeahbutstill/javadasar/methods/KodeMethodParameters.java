package com.yeahbutstill.javadasar.methods;

public class KodeMethodParameters {
    public static void main(String[] args) {
        sayHello("Dani", "Setiawan");
        sayHello("Maya", "Setiawan");
    }

    private static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
