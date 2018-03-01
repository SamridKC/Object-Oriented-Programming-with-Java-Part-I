
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList

        ArrayList<String> words = new ArrayList<String>();

        while(true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if(words.contains(word)) {
                for (String index: words) {
                    System.out.println(index);
                }
                break;
            }
            else {
                words.add(word);
            }
        }
        
    }
}