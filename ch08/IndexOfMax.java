import java.util.Arrays;
import java.util.Random;

public class IndexOfMax {
    
    public static void main(String[] args) {
        int size = 50;
        index(randomArray(size));
    }
    
    public static int index(int[] array) {
        int max = 0;
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                position = i;
            }
        }
        System.out.println(position);
        return position;
    }
    
    public static int[] randomArray(int size){
        Random random = new Random();
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
    