import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Type numbers: ");

        while(true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            if(number % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
            sum += number;
            counter++;
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + (float)((float)sum/(float)counter));
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        

    }
}
