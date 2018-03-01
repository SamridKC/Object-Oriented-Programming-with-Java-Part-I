import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());

        String result = name.substring((name.length()-length));
        System.out.println("Result: " + result);


    }
}
