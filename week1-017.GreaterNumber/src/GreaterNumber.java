import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal");
        }
        else {
            System.out.println("Greater number: " + (Math.max(firstNumber, secondNumber)));
        }

    }
}