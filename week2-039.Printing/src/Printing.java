public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        while(i < height) {
            printStars(width);
            i++;
        }
        // 39.3
    }

    public static void printTriangle(int size) {
        int i = 1;
        while(i <= size) {
            printStars(i);
            i++;
        }
        // 39.4
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct


        printRectangle(17,3);
        //printTriangle(4);

    }

}
