package com.yeahbutstill.javadasar.switchs.statements;

public class KataKunciYield {
    public static void main(String[] args) {
        var nilai = "A";
        String ucapan;

        // Tanpa yield
        switch (nilai) {
            case "A" -> ucapan = "Wow Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin Anda Salah jurusan";
        }
        System.out.println(ucapan);

        // Menggunakan yield, itu sama mirip dengan return value
        String ucapanYield = switch (nilai) {
            case "A":
                yield "Wow Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Anda Salah Jurusan";
        };
        System.out.println(ucapanYield);

    }
}
