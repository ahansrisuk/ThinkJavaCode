import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
       Random random = new Random();
       int number = random.nextInt(100) + 1;
       game(number);
    }
    
    public static void game(int number) {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Guess a number:");
        int guess = in.nextInt();
        
        System.out.println(number);
        
        int offset = guess - number;
        
        if (guess == number){
            System.out.println("Congratulations! You've won!");
        } else {
            System.out.println("You were off by " + offset);
            game(number);
        }
    }
    
}
