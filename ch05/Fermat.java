import java.util.Scanner;

public class Fermat {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number for a:");
        int a = in.nextInt();
        System.out.print("Enter a number for b:");
        int b = in.nextInt();
        System.out.print("Enter a number for c:");
        int c = in.nextInt();
        System.out.print("Enter a number for n:");
        int n = in.nextInt();
        
        checkFermat(a, b, c, c);
        
    }
    
    public static void checkFermat(double a, double b, double c, double n){
        double right = Math.pow(a, n) + Math.pow(b, n);
        double left = Math.pow(c, n);
        
        if ((n > 2) && (right == left)){
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }
}