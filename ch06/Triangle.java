import java.util.Scanner;

public class Triangle {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        
        boolean result = isDivisible(x, y, z);
        
        System.out.println(result);
    }
    
    public static boolean isDivisible(int x, int y, int z) {
        if (x + y < z) {
            return false;
        } else if (y + z < x) {
            return false;
        } else if (z + x < y) {
            return false;
        } else {
            return true;
        }
    }
}