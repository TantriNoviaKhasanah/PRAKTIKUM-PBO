package Tugas;

import java.util.Date;

public class Makanan extends Produk {
    private Date expired;
    private String komposisi;

    public Makanan() {
        super();
        this.expired = new Date();
        this.komposisi = "";
    }

    public Makanan(String nama, int harga, String stok,
                   Date expired, String komposisi) {
        super(nama, harga, stok);
        this.expired = expired;
        this.komposisi = komposisi;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Expired   : " + expired);
        System.out.println("Komposisi : " + komposisi);
    }
}
