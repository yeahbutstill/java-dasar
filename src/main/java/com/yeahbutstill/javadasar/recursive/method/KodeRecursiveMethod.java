package com.yeahbutstill.javadasar.recursive.method;

public class KodeRecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
    }

    public static int factorial(int value) {
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }


    // factorial recursive
    public static int factorialRecursive(int val) {
        if (val == 1) {
            return 1;
        } else {
            return val * factorialRecursive(val - 1);
        }
    }
}
