package SistemPendakian;

public class Pendaki {
    private String nik;
    private String nama;
    private int umur;

    public Pendaki(String nik, String nama, int umur) {
        this.nik = nik;
        this.nama = nama;
        this.umur = umur;
    }   

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getInfo() {
        return "NIK : " + nik +
                "\nNama : " + nama +
                "\nUmur : " + umur;
    }
}
