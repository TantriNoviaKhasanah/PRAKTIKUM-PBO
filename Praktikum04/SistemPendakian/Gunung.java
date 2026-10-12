package SistemPendakian;

public class Gunung {
    private String kodeGunung;
    private String namaGunung;
    private int kuota;

    public Gunung(String kodeGunung, String namaGunung, int kuota) {
        this.kodeGunung = kodeGunung;
        this.namaGunung = namaGunung;
        this.kuota = kuota;
    }

    public String getInfo() {
        return "Kode Gunung : " + kodeGunung +
                "\nNama Gunung : " + namaGunung +
                "\nKuota : " + kuota;
    }

    public void setNamaGunung(String namaGunung) {
    this.namaGunung = namaGunung;
}
}
