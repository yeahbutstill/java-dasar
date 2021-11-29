package com.yeahbutstill.javadasar.variables;

public class Variables {

    public static void main(String[] args) {

        // Perlu program Java itu di running dari atas ke bawah
        String name;
        name = "Dani Setiawan";

        int age = 28;
        String address = "Komp.Depag A 23";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // Deklarasi variable menggunakan keyword var
        var favFood = "Nasi Goreng";
        var favBand = "Title Fight";

        System.out.println(favFood);
        System.out.println(favBand);

        // Deklarasi konstant
        final String ibu = "Yuni";
        final var ayah = "Sehu";

        // final variable tidak bisa lagi diubah value nya.
//        ibu = "Nama Diubah";
//        ayah = "Nama Diubah";

        System.out.println(ibu);
        System.out.println(ayah);

    }

}
