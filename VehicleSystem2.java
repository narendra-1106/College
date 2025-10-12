abstract class Transport {
    abstract void move();
    void park() {
        System.out.println("Transport parked.");
    }
}

public class VehicleSystem2 extends Transport {
    void move() {
        System.out.println("Bus is moving.");
    }

    public static void main(String[] args) {
        VehicleSystem2 b = new VehicleSystem2();
        b.move();
        b.park();
    }
}
