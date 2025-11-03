import java.util.*;

public class ExcpThrow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (a < 5) {
            throw new ArithmeticException("Please enter a number greater than 5");
        } else {
            System.out.println("You entered a valid number: " + a);
        }
    }
}
