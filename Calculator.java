class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static String operationType = "Arithmetic Operations";

    public static void printStaticMethod() {
        System.out.println("Static method 1");
        System.out.println("Static method 2");
        System.out.println("Operation type: " + operationType);
    }

    public static void main(String[] args) {
        System.out.println("Static Method and Field Access Demo");
        Calculator.printStaticMethod();
        System.out.println("Static Field Accessed: " + Calculator.operationType);

        System.out.println("\nMethod Overloading Demo");

        Calculator calc = new Calculator();

        System.out.println("Sum of 10 and 20 (int): " + calc.add(10,20));
        System.out.println("Sum of 12.5 and 20.5 (double): " + calc.add(12.5, 20.5));
        System.out.println("Sum of 10, 20 and 30 (int): " + calc.add(10, 20, 30));
    }
}
