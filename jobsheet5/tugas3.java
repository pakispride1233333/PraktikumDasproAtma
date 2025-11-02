package jobsheet5;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah Anda mahasiswa terdaftar? (true/false): ");
        boolean terdaftar = sc.nextBoolean();

        if (terdaftar) {
            System.out.print("Apakah Anda memiliki kartu perpustakaan aktif? (true/false): ");
            boolean kartuAktif = sc.nextBoolean();

            if (kartuAktif) {
                System.out.println("Akses WiFi kampus dan perpustakaan diizinkan.");
            } else {
                System.out.println("Aktifkan kartu perpustakaan terlebih dahulu.");
            }
        } else {
            System.out.println("Akses ditolak. Hanya untuk mahasiswa terdaftar.");
        }
    }
}
