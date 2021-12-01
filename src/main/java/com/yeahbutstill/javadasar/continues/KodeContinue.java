package com.yeahbutstill.javadasar.continues;

public class KodeContinue {
    public static void main(String[] args) {
        for (int count = 1; count <= 200; count++) {
            if (count % 2 == 1) {
                continue;
            }
            System.out.println("Perulangan Ganjil-" + count);
        }
    }
}
