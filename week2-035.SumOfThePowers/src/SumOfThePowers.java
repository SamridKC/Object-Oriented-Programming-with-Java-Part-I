
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        int num = 0;
        int result = 0;

        while(num <= limit) {
            result += (int)Math.pow(2,num);
            num++;
        }
        System.out.println(result);

    }
}
