import java.util.Scanner;
    
public class Temperature {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double C;
        double F;
        
        System.out.println("Convert Celsius to Fahrenheit. Enter Celsius:");
        C = in.nextInt();
        F = C * 9/5 + 32;
        
        System.out.printf("%.1f C = %.1f F\n", C, F);
    }
}