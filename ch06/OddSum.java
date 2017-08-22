import java.util.Scanner;

public class OddSum {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int result = oddSum(n);
        
        System.out.println(result);
    }
    
    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return n + oddSum(n - 1);
        } else {
            return n + oddSum(n - 2);
        }
    }
}