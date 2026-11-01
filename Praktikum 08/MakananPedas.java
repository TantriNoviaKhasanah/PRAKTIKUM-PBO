public class MakananPedas extends Makanan {

    public MakananPedas() {
        super();
    }

    public MakananPedas(String nama) {
        super(nama);
    }

    @Override
    public void tampilkanRasa() {
        System.out.println("Rasa  : Pedas");
    }
}