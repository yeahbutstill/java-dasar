package com.yeahbutstill.javadasar.tipe.data.number;

public class KonversiTipeDataNumber {

    public static void main(String[] args) {

        // Widening Casting
        byte iniByte = 100;
        short iniShory = iniByte;
        int iniInt = iniShory;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // Narrowing Casting
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;

    }

}
