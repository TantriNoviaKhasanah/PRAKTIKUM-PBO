package Praktikum09;

public class ElektronikMain {
    public static void main(String[] args) {
        Kulkas kulkas = new Kulkas();
        kulkas.harga = 60000000;
        kulkas.merk = "SMEG";
        kulkas.warna = "Pink";
        kulkas.jumlahPintu = 2;

        TV tv = new TV();
        tv.harga = 30000000;
        tv.merk = "LG";
        tv.warna = "Hitam";
        tv.jenisLayar = "LED";
        tv.volume = 10;

        System.out.println("=== INFORMASI KULKAS ===");
        System.out.println(kulkas.getInfo());

        System.out.println("\n=== INFORMASI TV ===");
        System.out.println(tv.getInfo());
    }
}
