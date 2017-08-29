import java.util.Scanner;

public class SquareRoot {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double input = in.nextDouble();
        System.out.println(sqrRoot(input));        
    }
    
    public static double sqrRoot(double a){
        double number = a;
        double difference = a;
        double current = a/2;
        double next = 0;
        
        while (Math.abs(difference) >= 0.0001) {
            next = (current + (number / current)) / 2;
            difference = next - current;
            current = next;
            System.out.println(current);
        }
        return next;
    }
}
