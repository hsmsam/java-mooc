package part5.CardPayments;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        if (increase < 0) {
            this.balance += 0;
        } else {
            this.balance += increase;
        }
    }

    public boolean takeMoney(double amount) {
        if (balance < amount) {
            return false;
        }
        this.balance = this.balance - amount;
        return true;
    }
}
