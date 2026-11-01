public class DemoTugas {
    public static void main(String[] args) {
        MakananPedas makanan1 = new MakananPedas("Seblak");
        MakananManis makanan2 = new MakananManis("Brownies");

        System.out.println("=== MAKANAN PEDAS ===");
        makanan1.cetakInfo();
        makanan1.tampilkanRasa();

        System.out.println("\n=== MAKANAN MANIS ===");
        makanan2.cetakInfo();
        makanan2.tampilkanRasa();
    }
}
