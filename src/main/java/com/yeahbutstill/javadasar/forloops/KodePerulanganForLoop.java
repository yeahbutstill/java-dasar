package com.yeahbutstill.javadasar.forloops;

public class KodePerulanganForLoop {
    public static void main(String[] args) {
        // Tanpa henti
//        for (;;) {
//            System.out.println("Please Stop");
//        }

        // menggunakan Kondisi
//        var count = 1;
//        for (; count <= 10;) {
//            System.out.println("Perulangan ke- " + count);
//            count++;
//        }

        // menggunakan Init Statement
//        for (var count = 1; count <= 10;) {
//            System.out.println("Perulangan ke-" + count);
//            count++;
//        }

        // menggunakan Post Statement
        for (var count = 1; count <= 10; count++) {
            System.out.println("Perulangan Ke-" + count);
        }
        
    }
}
