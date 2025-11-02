package jobsheet5;

import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

     
        if (uktLunas) {
            System.out.println("Registrasi berhasil. Silakan cetak KRS Anda.");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }

   
        System.out.println(uktLunas ? 
            "Registrasi berhasil. Silakan cetak KRS Anda." : 
            "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
    }
}
