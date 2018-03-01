
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num = 1;
        int sum = 0;
        System.out.println("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());

        while (num <= limit) {
            sum += num;
            num++;
        }
        System.out.println(sum);

    }
}
