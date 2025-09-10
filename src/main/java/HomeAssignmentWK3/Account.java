package HomeAssignmentWK3;

public class Account {
    double balance;

    public Account() {
        this.balance = 0.0;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return amount;
        }
        return 0.0;
    }

    public double getBalance() {
        return balance;
    }


}
