package Tugas;

public class Produk {
    public String nama;
    public int harga;
    public String stok;

    public Produk() {
        this.nama = "";
        this.harga = 0;
        this.stok = "";
    }

    public Produk(String nama, int harga, String stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void cetakInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Stok  : " + stok);
    }
}

