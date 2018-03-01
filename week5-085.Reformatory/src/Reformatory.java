public class Reformatory {

//    private Person man;
    private int counter = 0;

    public int weight(Person person) {
        // return the weight of the person
//        this.man = person;
        counter++;
        return person.getWeight();
    }

    public void feed(Person person) {
//        this.man = person;
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return counter;
    }

}
