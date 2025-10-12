abstract class BankAccount {
    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void calculateInterest();
    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankOperation2 extends BankAccount {
    BankOperation2(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest: " + interest);
    }

    public static void main(String[] args) {
        BankOperation2 s = new BankOperation2(2000);
        s.showBalance();
        s.calculateInterest();
    }
}
