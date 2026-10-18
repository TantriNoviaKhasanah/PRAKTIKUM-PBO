package Tugas;

import java.util.Date;

public class DemoTugas {
    public static void main(String[] args) {
        Makanan makanan = new Makanan(
            "Roti", 10000, "20 buah",
            new Date(), "Tepung, gula, telur"
        );

        Elektronik elektronik = new Elektronik(
            "Headset", 150000, "10 buah",
            2, 12345
        );

        System.out.println("=== DATA MAKANAN ===");
        makanan.cetakInfo();

        System.out.println("\n=== DATA ELEKTRONIK ===");
        elektronik.cetakInfo();
    }
}
