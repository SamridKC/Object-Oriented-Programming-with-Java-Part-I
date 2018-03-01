import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birdDB = new ArrayList<Bird>();

    public BirdDatabase(){
        this.birdDB = new ArrayList<Bird>();
    }
    public void AddBirds(Bird newBird) {
        this.birdDB.add(newBird);
    }
    public void printStats() {
        for (Bird index: this.birdDB) {
            System.out.println(index);
        }
    }
    public void observed(String observe) {
        for (Bird index: this.birdDB) {
            if(index.getName().equals(observe)) {
                index.getTimesObserved();
            }
            else {
                System.out.println("Is not a bird!");
            }
        }
    }
    public void show(String showwt) {
        for(Bird index: this.birdDB) {
            if(index.getName().equals(showwt)) {
                System.out.println(index);
            }
        }
    }
}
