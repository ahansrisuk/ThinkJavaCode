public class Date {
    
    public static void printAmerican(String day, String month, int date, int year){
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    
    public static void printEuropean(String day, String month, int date, int year){
        System.out.println(day + " " + date + " " + month + " " + year);
    }
    
    public static void main(String[] args) {
        
        String day = "Friday";
        int date = 13;
        String month = "August";
        int year = 2017;
        
        printAmerican(day, month, date, year);
        printEuropean(day, month, date, year);
    }
}