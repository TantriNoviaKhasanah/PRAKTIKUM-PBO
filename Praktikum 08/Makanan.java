public abstract class Makanan {
    public String nama;

    public Makanan() {
        this.nama = "";
    }

    public Makanan(String nama) {
        this.nama = nama;
    }

    public void cetakInfo() {
        System.out.println("Nama  : " + nama);
    }

    public abstract void tampilkanRasa();
}
