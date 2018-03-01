
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// write here the main program
        Scanner reader = new Scanner(System.in);

//        Student pekka = new Student("Pekka Mikkola", "013141590");
//        System.out.println("name: " + pekka.getName());
//        System.out.println("studentnumber: " + pekka.getStudentNumber());
//        System.out.println(pekka);

        ArrayList<Student> list = new ArrayList<Student>();

        while(true) {
            System.out.println("name:");
            String name = reader.nextLine();
            if (!name.isEmpty()) {
                System.out.println("studentnumber: ");
                String studentNumber = reader.nextLine();

                list.add(new Student(name, studentNumber));
            }
            else {
                break;
            }
        }

        for(Student index: list) {
            System.out.println(index);
        }

        System.out.println("Give search term: ");
        String term = reader.nextLine();


        System.out.println("Result:");
        for(Student index: list) {
            if(index.getName().contains(term)) {
                System.out.println(index);
            }
        }
    }
}

