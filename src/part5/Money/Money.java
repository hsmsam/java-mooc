package part5.Money;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        Money newMoney = new Money(totalEuros, totalCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        int total = this.euros *100 + this.cents;
        int totalCompared = compared.euros *100 + compared.cents;

        if (total < totalCompared && totalCompared < 0) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int newEuro = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        if (newCents < 0) {
            newCents += 100;
            newEuro -= 1;
        }

        if (newEuro < 0) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }

        Money newMoney = new Money(newEuro, newCents);

        return newMoney;
    }
}
