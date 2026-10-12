package SistemPendakian;

import java.util.ArrayList;

public class Simaksi {
    private String idSimaksi;
    private String tanggalPendakian;
    private Gunung gunung;
    private ArrayList<Pendaki> daftarPendaki;

    public Simaksi(String idSimaksi, String tanggalPendakian, Gunung gunung) {
        this.idSimaksi = idSimaksi;
        this.tanggalPendakian = tanggalPendakian;
        this.gunung = gunung;
        this.daftarPendaki = new ArrayList<>();
    }

    public void tambahPendaki(Pendaki pendaki) {
        daftarPendaki.add(pendaki);
    }

    public String getInfo() {
        String info = "ID SIMAKSI : " + idSimaksi +
                "\nTanggal Pendakian : " + tanggalPendakian +
                "\n\n=== DATA GUNUNG ===\n" +
                gunung.getInfo() +
                "\n\n=== DAFTAR PENDAKI ===\n";

        for (Pendaki p : daftarPendaki) {
            info += p.getInfo() + "\n------------------\n";
        }

        return info;
    }
}
