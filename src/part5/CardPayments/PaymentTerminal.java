package part5.CardPayments;

public class PaymentTerminal {
    private double money;
    private int affordableMeals = 0;
    private int heartyMeals = 0;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double change = 0;
        if (payment >= 2.50) {
            affordableMeals++;
            change = payment - 2.50;
            money += 2.50;
            return change;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        double change = 0;
        if (payment >= 4.30) {
            heartyMeals++;
            change = payment - 4.30;
            money += 4.30;
            return change;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) {
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        }

        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            money += sum;
        } else {
            money += 0;
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
