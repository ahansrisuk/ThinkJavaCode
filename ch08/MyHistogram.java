import java.util.Arrays;
import java.util.Random;

public class MyHistogram {
    
    public static void main(String[] args) {
        int size = 50;
        int counter = 5;
        histogram(randomArray(size), counter);
    }
    
    public static int[] histogram(int[] a, int counter) {
        int[] histogram = new int[100];
        for (int i = 0; i <= counter; i ++) {
            int index = a[i];
            
            histogram[index]++;
        }
        System.out.println(Arrays.toString(histogram));
        return histogram;
    }
    
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

}