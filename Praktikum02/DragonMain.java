package Praktikum02;

public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        System.out.println("=== Status Awal Dragon 1 ===");
        dragon1.printStatus();

        System.out.println("=== Pergerakan Dragon 1 ===");
        dragon1.move(3);
        dragon1.changeDirection(2);
        dragon1.move(5);
        dragon1.printStatus();

        Dragon dragon2 = new Dragon(10, 10, 3);
        System.out.println("=== Status Awal Dragon 2 ===");
        dragon2.printStatus();

        System.out.println("=== Pergerakan Dragon 2 ===");
        dragon2.move(2);
        dragon2.changeDirection(4);
        dragon2.move(4);
        dragon2.printStatus();
    }
}
