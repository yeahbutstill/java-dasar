package com.yeahbutstill.javadasar.switchs.statements;

public class SwitchLambda {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }
    }
}
