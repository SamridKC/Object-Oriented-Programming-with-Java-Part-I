import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;


    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density) {
        this(density, 20,10);
    }

    public void printLine() {
        Random random = new Random();
        String variable = "";
        for(int i = 0; i < this.width; ++i) {
            if(random.nextDouble() <= this.density) {
                variable += "*";
                starsInLastPrint++;
            }
            else {
                variable += " ";
            }
        }
        System.out.print(variable);
    }

    public void print() {
        starsInLastPrint = 0;
        for(int i = 0; i < this.height; ++i) {
            printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
 }
