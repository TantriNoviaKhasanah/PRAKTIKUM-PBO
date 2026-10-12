package SistemPendakian;

public class PendakianDemo {
    public static void main(String[] args) {

        Gunung g1 = new Gunung(
                "G005",
                "Rinjani",
                200);

        Pendaki p1 = new Pendaki(
                "350101",
                "Novi",
                19);

        Pendaki p2 = new Pendaki(
                "350102",
                "Vella",
                20);

        Simaksi s1 = new Simaksi(
                "SIM005",
                "10 Oktober 2026",
                g1);

        s1.tambahPendaki(p1);
        s1.tambahPendaki(p2);

        g1.setNamaGunung("Arjuno");
    }
}
