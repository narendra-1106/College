class Vehicle {
    String brand = "Ford";

    public void msg() {
        System.out.println("Method from vehicle class");
    }
}

class Car extends Vehicle {
    String modelName = "Mustang";
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.msg();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
