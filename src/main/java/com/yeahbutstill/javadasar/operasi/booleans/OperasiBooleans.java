package com.yeahbutstill.javadasar.operasi.booleans;

public class OperasiBooleans {

    public static void main(String[] args) {

        var absen = 70;
        var nilaiAkhir = 80;
        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        // hasilnya false, karena nilai lulus absen belum memenuhi syarat
        System.out.println(lulus);

    }

}
