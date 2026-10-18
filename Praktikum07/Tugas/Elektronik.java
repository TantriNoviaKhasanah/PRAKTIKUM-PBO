package Tugas;

public class Elektronik extends Produk {
    private int garansi;
    private int nomorSeri;

    public Elektronik() {
        super();
        this.garansi = 0;
        this.nomorSeri = 0;
    }

    public Elektronik(String nama, int harga, String stok,
                      int garansi, int nomorSeri) {
        super(nama, harga, stok);
        this.garansi = garansi;
        this.nomorSeri = nomorSeri;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Garansi    : " + garansi + " tahun");
        System.out.println("Nomor Seri : " + nomorSeri);
    }
}
