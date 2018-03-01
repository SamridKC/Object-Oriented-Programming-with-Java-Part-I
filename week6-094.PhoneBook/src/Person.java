import java.util.ArrayList;

public class Person {

    private String name;
    private String number;

    public Person(String namePerson, String phoneNum) {
        this.name = namePerson;
        this.number = phoneNum;
    }

    public String getName(){
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }

    @Override
    public String toString() {
        return this.name + " number: " + this.number;
    }
}
