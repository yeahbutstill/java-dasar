package com.yeahbutstill.javadasar.foreachs;

public class KodeForEach {
    public static void main(String[] args) {
        String[] array = {
                "Dani", "Setiawan", "Sofware Engineer",
                "Maya", "Triyanti", "Spd"
        };

        // Tanpa for each
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("===========Dengan For Each===================");
        for (var ary : array) {
            System.out.println(ary);
        }
    }
}
