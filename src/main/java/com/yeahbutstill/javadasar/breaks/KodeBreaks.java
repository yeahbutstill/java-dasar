package com.yeahbutstill.javadasar.breaks;

public class KodeBreaks {
    public static void main(String[] args) {
        var count = 1;
        while (true) {
            System.out.println("Perulangan ke-" + count);
            count++;

            if (count > 10) {
                break;
            }
        }
    }
}
