import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int number = random.nextInt(100) + 1;
        int guess;
        int offset;
        System.out.println(number);
        
        System.out.println("Guess a number:");
        guess = in.nextInt();
        offset = guess - number;
        
        System.out.println("You were off by " + offset);
    }

}
