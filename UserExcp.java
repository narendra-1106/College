import java.util.*;

// Custom Exception Class
class myException extends Exception {
    public myException(String message) {
        super(message);
    }
}

public class UserExcp {
    public static void main(String args[]) {
        try {
            int a = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            a = sc.nextInt();

            if (a < 5)
                throw new myException("Please enter a number greater than 5");
            else
                System.out.println("You entered a valid number: " + a);

        } catch (myException e) {
            System.out.println(e.getMessage());
        }
    }
}
