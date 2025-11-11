package jobsheet9;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilai = new int[jmlMhs];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        
        int hasil = -1;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                hasil = i; 
                break; // hentikan jika sudah ketemu
            }
        }

        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ditemukan, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan!");
        }
        System.out.println();
    }
}
