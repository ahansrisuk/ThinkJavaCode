import java.util.Scanner;

public class Divisible {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        boolean result = isDivisible(n,m);
        
        System.out.println(result);
    }
    
    public static boolean isDivisible(int n,int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }
}