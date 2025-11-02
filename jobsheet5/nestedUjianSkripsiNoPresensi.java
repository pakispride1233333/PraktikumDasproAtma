package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsiNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        int bimbingan1, bimbingan2;

        System.out.print("Masukkan nama mahasiswa: ");
        nama = sc.nextLine();

        System.out.print("Masukkan jumlah bimbingan Pembimbing 1: ");
        bimbingan1 = sc.nextInt();

        System.out.print("Masukkan jumlah bimbingan Pembimbing 2: ");
        bimbingan2 = sc.nextInt();

        if (bimbingan1 >= 4) {
            if (bimbingan2 >= 4) {
                System.out.println("Selamat " + nama + ", Anda dapat mengikuti ujian skripsi!");
            } else {
                System.out.println("Maaf " + nama + ", jumlah bimbingan Pembimbing 2 kurang dari 4 kali.");
            }
        } else {
            System.out.println("Maaf " + nama + ", jumlah bimbingan Pembimbing 1 kurang dari 4 kali.");
        }

        sc.close();
    }
}
