package jobsheet9;

import java.util.Scanner;

public class ArrayNilaiXX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        double total = 0;
        double rata2;

        
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilaiAkhir[i] = sc.nextInt();
            total += nilaiAkhir[i]; 
        }

       
        rata2 = total / nilaiAkhir.length;

        System.out.println("\n=== Hasil Kelulusan Mahasiswa ===");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus");
            } else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus");
            }
        }

        System.out.println("\nRata-rata nilai akhir: " + rata2);

    }
}
