package jobsheet9;

import java.util.Scanner;

public class tugas1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;

       
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

       
        double rata = (double) total / jumlah;

        
        int max = nilai[0];
        int min = nilai[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        
        System.out.println("\n=== HASIL PENGOLAHAN NILAI ===");
        System.out.println("Nilai yang dimasukkan:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nNilai rata-rata : " + rata);
        System.out.println("Nilai tertinggi : " + max);
        System.out.println("Nilai terendah  : " + min);
    }
}
