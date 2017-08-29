import java.util.Scanner;

public class Factorial{
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int output = loop(n);
       
        System.out.println(output);
    }
    
    public static int loop(int n){
        int total = n;
        
        while (n > 1) {
           total = total * (n - 1);
           n -= 1;
        }
        
        return total;
    }
}