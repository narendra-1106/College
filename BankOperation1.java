interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

public class BankOperation1 implements Bank {
    double balance = 1000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public static void main(String[] args) {
        BankOperation1 a = new BankOperation1();
        a.deposit(500);
        a.withdraw(300);
    }
}
