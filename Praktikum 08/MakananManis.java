public class MakananManis extends Makanan {

    public MakananManis() {
        super();
    }

    public MakananManis(String nama) {
        super(nama);
    }

    @Override
    public void tampilkanRasa() {
        System.out.println("Rasa  : Manis");
    }
}
