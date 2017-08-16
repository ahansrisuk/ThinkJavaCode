import java.util.Scanner;

public class Seconds {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int input;
        int hours;
        int minutes;
        int seconds;
        
        System.out.print("Enter the number of seconds:\n");
        input = in.nextInt();
        hours = input / 3600;
        minutes = (input % 3600) / 60;
        seconds = (input % 3600) % 60;
        
        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds\n", input, hours, minutes, seconds);
            
    }
}