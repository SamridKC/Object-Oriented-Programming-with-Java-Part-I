public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if(this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        if(this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        double limit = 150.00;
        double total = this.balance + amount;
        if (amount < 0) {
            return;
        }

        if(total <= limit) {
            this.balance += amount;
        }
        else {
            this.balance = this.balance + (limit - this.balance);
        }
    }
}
