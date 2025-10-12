abstract class Vehicle {
    abstract void start();
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

public class VehicleSystem1 extends Vehicle {
    void start() {
        System.out.println("Car started.");
    }

    public static void main(String[] args) {
        VehicleSystem1 c = new VehicleSystem1();
        c.start();
        c.stop();
    }
}
