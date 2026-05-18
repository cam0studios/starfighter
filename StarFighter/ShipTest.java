package StarFighter;

public class ShipTest {
    public static void main(String[] args) {
        MovingThing ship1 = new Ship();
        System.out.println("Ship 1" + ship1);

        MovingThing ship2 = new Ship(50, 75);
        System.out.println("Ship 2" + ship2);

        MovingThing ship3 = new Ship();
        ship3.setX(3);
        ship3.setY(5);
        System.out.println("Ship 3" + ship3);
    }
}
