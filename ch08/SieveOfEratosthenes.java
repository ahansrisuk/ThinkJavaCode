import java.util.Scanner;
import java.util.Arrays;

public class SieveOfEratosthenes{
    
    public static void main(String[] args) {
        
        int n = 10;
        
        sieve(n);
    }
    
    public static boolean[] sieve(int n) {
        
        int[] numbers = new int[n];
        boolean[] primes = new boolean[n];
        int p = 2;
        
        for (int i = 0; i < n; i++) {
            numbers[i] = i;
        }
        
        for (int i = 0; i < n; i++) {
            primes[i] = true;
        }
        
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(primes));
        return primes;
    }
}