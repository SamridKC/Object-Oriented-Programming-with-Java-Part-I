public class Counter{

    private boolean check;
    private int number;

    // creates a new counter with the given value. The check is on if the parameter given to check was true.
    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
    }

    // creates a new counter with the given value. The check on the new counter should be off.
    public Counter(int startingValue) {
        this(startingValue, false);
    }

    // creates a new counter with the starting value 0. The check is on if the parameter given to check was true.
    public Counter(boolean check) {
        this(0, check);
    }

    // creates a new counter with the starting value of 0 and with checking off.
    public Counter() {
        this(0, false);
    }

    // returns the current value of the counter
    public int value() {
        return this.number;
    }

    // increases the value of the counter by one
    public void increase() {
        increase(1);
    }

    // decreases the value of the counter by one, but not below 0 if the check is on
    public void decrease() {
        decrease(1);
    }

    // increases the value by the amount of the parameter. If the value of the parameter is negative, the value will not change.
    public void increase(int increaseAmount) {
        if(increaseAmount < 0) {
            return;
        }
        this.number += increaseAmount;
    }

    // decreases the value of the counter by the amount given by the parameter, but not below 0 if the check is on. If the value of the parameter is negative, the value of the counter will not change.
    public void decrease(int decreaseAmount) {
        if(decreaseAmount < 0) {
            return;
        }
        this.number -= decreaseAmount;
        if(this.check && this.number < 0) {
            this.number = 0;
            return;
        }

    }

}