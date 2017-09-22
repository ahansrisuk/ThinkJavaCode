/**
 * Recursion exercise.
 */
public class Recurse {
    
    public static void main(String[] args) {
        String s = "It's time for the percolator!";
        // System.out.println(first(s));
        // System.out.println(rest(s));
        // System.out.println(middle(s));
        // System.out.println(length(s));
        printString(s);
        // printBackwards(s);
    }
    
    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }
    
    // Can use if/else but is more concise without
    public static void printString(String s) {
        if (length(s) > 0) {
            System.out.println(first(s));
            printString(rest(s));
        }
    }
     //Can use if/else but is more concise without
    public static void printBackwards(String s) {
        if (length(s) > 0) {
            printBackwards(rest(s));
            System.out.println(first(s));
        }
    }
    
    public static boolean isPalindrome(String s) {
        return true;
    }

}
