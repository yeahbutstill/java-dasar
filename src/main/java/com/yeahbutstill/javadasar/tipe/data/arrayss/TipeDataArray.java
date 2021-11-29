package com.yeahbutstill.javadasar.tipe.data.arrayss;

public class TipeDataArray {

    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Dani";
        arrayString[1] = "Setiawan";
        arrayString[2] = "Software Engineer";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        // Array Initializer
        int[] arrayInt = new int[]{
                10,90,80,67,29
        };

        long[] arrayLong = {
                10L,90L,20L,80L,40L,30L
        };
        
        System.out.println(arrayLong.length);

        // Array di dalam Array
        String[][] members = {
                {"Dani", "Maya"},
                {"Winda", "Lestari"},
                {"Sasuke"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

    }

}
