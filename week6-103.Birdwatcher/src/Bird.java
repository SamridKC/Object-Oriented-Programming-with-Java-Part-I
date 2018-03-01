public class Bird {
    private String name;
    private String latinName;
    private int timesObserved;

    public Bird(String Name, String Latin) {
        this.name = Name;
        this.latinName = Latin;
        this.timesObserved = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void getTimesObserved() {
        timesObserved++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.timesObserved + " observations";
    }
}
