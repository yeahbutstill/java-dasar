package com.yeahbutstill.javadasar.tipe.data.bukan.primitif;

public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        Short iniShort; // default value null
        iniShort = 100;

        // konversi dari primitf menjadi kebukan primitf
        int iniInt = 100; // primitif
        Integer iniIntBukanPrimitf = iniInt; // bukan primitif

        // konversi dari value yang bukan kompetable
        short shortAge = iniIntBukanPrimitf.shortValue();
        // perlu diingin didalam tipe data bukan primitif dia memiliki method
        // cara memanggil method menggunakan .(titik) setelah nama variable atau object nya.
        byte byteAge = iniIntBukanPrimitf.byteValue();
        System.out.println(shortAge + " " + byteAge);

    }

}
