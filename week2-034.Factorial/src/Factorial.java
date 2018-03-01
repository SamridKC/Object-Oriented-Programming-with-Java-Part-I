import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        int fact = 1;

        if (number == 0) {
            System.out.println(fact);
        }

        while (number >= 1) {
            fact *= number;
            number--;
        }

        System.out.println(fact);

    }
}
