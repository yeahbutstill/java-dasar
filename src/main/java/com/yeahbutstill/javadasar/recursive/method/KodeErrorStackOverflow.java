package com.yeahbutstill.javadasar.recursive.method;

public class KodeErrorStackOverflow {
    public static void main(String[] args) {
         loop(100000);
    }

    public static void loop(int val) {
        if (val == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop-" + val);
            loop(val - 1);
        }
    }
}
