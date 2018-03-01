import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int pwdLength;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.pwdLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pwd = "";
        for(int i = 0; i < this.pwdLength; i++){
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(25));
            pwd = pwd + symbol;
        }
        return pwd;

    }
}
