
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int newEuros, newCents;
        newEuros = this.euros + added.euros;
        newCents = this.cents + added.cents;
        Money addedMoney = new Money(newEuros, newCents);
        return addedMoney;
    }

    public boolean less(Money compared) {
        if(this.euros < compared.euros) {
            return true;
        }
        else if(this.euros == compared.euros) {
            if(this.cents < compared.cents) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public Money minus(Money decremented) {
        Money helperMoney = new Money(0,0);
        int decrEuros, decrCents;
        decrEuros = this.euros - decremented.euros;
        if(decremented.cents > this.cents) {
            decrEuros = decrEuros -1;
            decrCents = 100 - decremented.cents;
        }
        else {
            decrCents = this.cents - decremented.cents;
        }
        Money decrementMoney = new Money(decrEuros, decrCents);
        if (decrementMoney.less(helperMoney)) {
            decrementMoney = new Money(0,0);
        }
        return decrementMoney;
    }

}
