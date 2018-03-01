import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        BirdDatabase newDB = new BirdDatabase();
        Scanner reader = new Scanner(System.in);
        while(true) {
            System.out.print("? ");
            String response = reader.nextLine();
            if(response.equals("Quit")) {
                break;
            }
            if(response.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                Bird newBird = new Bird(name, latinName);
                newDB.AddBirds(newBird);
            }
            if(response.equals("Observation")) {
                System.out.print("What was observed:? ");
                String observed = reader.nextLine();
                newDB.observed(observed);
            }
            if(response.equals("Show")) {
                System.out.print("What? ");
                String showWhat = reader.nextLine();
                newDB.show(showWhat);

            }
            if(response.equals("Statistics")) {
                newDB.printStats();
            }
        }


    }

}
