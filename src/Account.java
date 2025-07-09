public class Account {
    private String holder;
    private double balance;

    public Account(String holder) {
        this.holder = holder;
        this.balance = 0.0;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
        }
    }

    public boolean withdraw(double value) {
        if (value > 0 && value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }
}
