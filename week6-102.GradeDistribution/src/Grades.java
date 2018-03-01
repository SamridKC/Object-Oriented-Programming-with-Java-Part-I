import java.util.Scanner;

public class Grades {
    private int acceptedScores = 0;
    private int notAccepted = 0;
    private int stars[] = {0,0,0,0,0,0};


    public void gradeCollect(Scanner scanner) {
        while(true) {
            int i = Integer.parseInt(scanner.nextLine());
            if(i == -1) {
                break;
            }
            else if(i >= 0 && i <=29) {
                stars[0]++;
                notAccepted++;
            }
            else if(i >= 30 && i <= 34) {
                stars[1]++;
                acceptedScores++;
            }
            else if(i >= 35 && i <= 39) {
                stars[2]++;
                acceptedScores++;
            }
            else if(i >= 40 && i <= 44) {
                stars[3]++;
                acceptedScores++;
            }
            else if(i >= 45 && i <= 49) {
                stars[4]++;
                acceptedScores++;
            }
            else if(i >= 50 && i <= 60) {
                stars[5]++;
                acceptedScores++;
            }

        }
    }

    public void printStarsAndPercentage(){
        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < stars[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Accepted Percentage: " + (100 * (float)acceptedScores/(float)(acceptedScores+notAccepted)));

    }
}
