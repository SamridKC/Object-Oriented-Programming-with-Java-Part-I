import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        // write the guessing logic here
        int low = lowerLimit;
        int high = upperLimit;
        boolean response;
        while(low != high) {
            response = isGreaterThan(average(low, high));
            if(response){
                low = (average(low, high)+1);
            }
            else {
                high = average(low, high);
            }
        }
        System.out.println("The number you're thinking of is " + high);

    }

    // implement here the methods isGreaterThan and average
    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + (value) + "? (y/n)");
        String response = reader.nextLine();
        if(response.equals("y")) {
            return true;
        }
        return false;
    }

    public int average(int firstNumber, int secondNumber) {
        int average = (firstNumber + secondNumber)/2;
        return average;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
