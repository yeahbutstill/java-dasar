package com.yeahbutstill.javadasar.ternary.operator;

public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        if (nilai >= 75) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silakan Coba Lagi";
        }
        System.out.println(ucapan);

        // Dengan ternary operator
        var ujian = 75;
        String hasil = ujian >= 75 ? "Selamat Anda Lulus" : "Silakan Coba Lagi";
        System.out.println(hasil);
    }
}
