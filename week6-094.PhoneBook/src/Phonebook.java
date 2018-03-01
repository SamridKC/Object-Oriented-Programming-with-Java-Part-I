import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> members = new ArrayList<Person>();

    public void add(String name, String number) { //creates a Person-object and adds it to the ArrayList inside the Phonebook
        Person newPerson = new Person(name, number);
        members.add(newPerson);
    }

    public void printAll() { //prints all the persons inside the Phonebook
        for (Person index: this.members) {
            System.out.println(index);
        }
    }

    public String searchNumber(String name) {
        for(Person index: this.members) {
            if(index.getName().equals(name)) {
                return index.getNumber();
            }2
        }
        return "number not known";
    }

}
