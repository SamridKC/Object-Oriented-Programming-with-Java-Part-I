
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics(){
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if(this.amountOfNumbers == 0){
            return 0;
        }
        return this.sum/(double)this.amountOfNumbers;

    }


}
