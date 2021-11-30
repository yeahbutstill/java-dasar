package com.yeahbutstill.javadasar.ifs.statements;

public class IfStatements {

    public static void main(String[] args) {
        var nilai = 80;
        var absen = 90;

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Anda Lulus Nilai A");
        } else if (nilai >= 70 && absen >= 70){
            System.out.println("Anda Lulus Nilai B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Anda Lulus Nilai C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Anda Lulus Nilai D");
        } else {
            System.out.println("Anda Tidak Lulus");
        }
    }

}
