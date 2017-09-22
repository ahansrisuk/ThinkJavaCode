import java.util.Arrays;

public class PowerArray {
    
    public static void main(String[] args){
        double[] a = {1, 2, 3, 4, 5};
        double power = 3.0;
        powArray(a, power);
    }
    
    public static double[] powArray(double[] a, double power){
        double[] squares = new double[a.length];
        for (int i = 0; i < a.length; i++) { 
            squares[i] = Math.pow(a[i], power);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(squares));
        return squares;
    }        
}