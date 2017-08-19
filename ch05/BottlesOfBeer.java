import java.util.Scanner;

public class BottlesOfBeer {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many bottles?");
        int n = in.nextInt();
        
        bottleCount(n);
    }
    
    public static void bottleCount(int n) {
        if (n == 0) {
                
            songEnd();
                
        } else {
            
            songVerse(n);
            
            bottleCount(n - 1);
        }
    }
    
    public static void songEnd() {
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya' can't take one down, ya' can't pass it around,");
        System.out.println("'cause there are no more bottles of beer on the wall!");
    }
    
    public static void songVerse(int n) {
        System.out.println(n + " bottles of beer on the wall,");
        System.out.println(n + " bottles of beer,");
        System.out.println(n + " ya' take one down, ya' pass it around,");
        System.out.println(n + " bottles of beer on the wall.");
    }
}
