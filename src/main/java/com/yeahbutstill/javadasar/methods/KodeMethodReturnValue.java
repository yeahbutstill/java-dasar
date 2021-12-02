package com.yeahbutstill.javadasar.methods;

public class KodeMethodReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = sum(a, b);

        System.out.println(c);

        // Operasi
        System.out.println(hitung(100, "+", 400 ));
        System.out.println(hitung(100, "-", 400 ));
        System.out.println(hitung(100, "salah", 400 ));
    }

    public static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    public static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }

}
