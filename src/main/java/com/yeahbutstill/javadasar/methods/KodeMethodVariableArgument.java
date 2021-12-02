package com.yeahbutstill.javadasar.methods;

public class KodeMethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 80, 80, 80, 90};
        sayCongrats1("Dani", values);

        sayCongrats2("Maya", 80, 90, 79, 48, 70);
    }

    // Tanpa Variable Argument
    public static void sayCongrats1(String name, int[] values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Belum Lulus");
        }
    }

    // Menggunakan Variable Argument
    public static void sayCongrats2(String name, int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Belum Lulus");
        }
    }

}
