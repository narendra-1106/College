interface Vehicle {
    void start();
}

interface Engine {
    void showPower();
}

class Car implements Vehicle, Engine {
    public void start() {
        System.out.println("Car has started.");
    }

    public void showPower() {
        System.out.println("Engine power is 200 HP.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.showPower();
    }
}
