package Praktikum09;

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    public String getInfo() {
        return super.getInfo() +
                "Jumlah Pintu: " + jumlahPintu;
    }
}
