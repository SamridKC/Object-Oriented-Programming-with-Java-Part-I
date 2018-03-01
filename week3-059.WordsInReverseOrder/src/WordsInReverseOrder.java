import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while(true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if(word.isEmpty()) {
                System.out.println("You typed the following words: ");
                Collections.reverse(words);
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
