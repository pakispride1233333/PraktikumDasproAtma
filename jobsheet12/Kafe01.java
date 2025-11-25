package jobsheet12;

public class Kafe01 {

    public static void main(String[] args) {
        Menu("Budi", true, "DISKON50"); 
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {

       
        if (isMember) {
            System.out.println("Selamat datang, " + namaPelanggan + "!");
        }

       
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam – Rp 15,000");
        System.out.println("2. Cappuccino – Rp 20,000");
        System.out.println("3. Latte – Rp 22,000");
        System.out.println("4. Teh Tarik – Rp 12,000");
        System.out.println("5. Roti Bakar – Rp 10,000");
        System.out.println("6. Mie Goreng – Rp 18,000");
        System.out.println("=============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
}
