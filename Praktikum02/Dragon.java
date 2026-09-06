package Praktikum02;

public class Dragon {
    int x;
    int y;
    int direction;

    public Dragon() {
        x = 0;
        y = 0;
        direction = 1;
    }

    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        changeDirection(direction);
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid. Gunakan 1 (Atas), 2 (Kanan), 3 (Bawah), atau 4 (Kiri). ");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1:
                y -= steps;
                break;
            case 2:
                x += steps;
                break;
            case 3:
                y += steps;
                break;
            case 4:
                x -= steps;
                break;
            default:
                System.out.println("Direction tidak valid. Dragon tidak bergerak.");
        }
    }

    // Method untuk mencetak ststus posisi dan arah dragon
    public void printStatus() {
        System.out.println("Posisi  :   (" + x + ", " + y + ")");
        System.out.println("Arah    : " + direction);
        System.out.println("==================================");
    }
}
