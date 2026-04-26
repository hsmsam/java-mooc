package part4.PaymentCard;

public class PaymentCard {
    private double balance = 0;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if ((balance - 2.6 >= 0)) {
            balance = balance - 2.6;
        }
    }

    public void eatHeartily() {
        if ((balance - 4.6 >= 0)) {
            balance = balance - 4.6;
        }
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            this.balance = balance + 0;
        } else {
            balance = balance + amount;
        }

        if (balance > 150) {
            balance = 150;
        }
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
