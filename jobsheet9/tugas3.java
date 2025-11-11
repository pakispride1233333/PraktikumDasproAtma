package jobsheet9;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        String[] menu = {
                "Nasi Goreng",
                "Mie Goreng",
                "Roti Bakar",
                "Kentang Goreng",
                "Teh Tarik",
                "Cappucino",
                "Chocolate Ice"
        };

        // Input nama makanan yang ingin dicari
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        // Proses Linear Search
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }

        // Output hasil pencarian
        if (ditemukan) {
            System.out.println("✅ Makanan \"" + cari + "\" tersedia di menu.");
        } else {
            System.out.println("❌ Maaf, makanan \"" + cari + "\" tidak ditemukan di menu.");
        }
    }
}
