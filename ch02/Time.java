public class Time {
    
    public static void main(String[] args) {
        
        int hour = 16;
        int minute = 20;
        int second = 51;
        
        //changed from int to double because of division rounding errors
        double totalSeconds = (24 * 360);
        double secondsPassed = (hour * 360) + (minute * 60) + second;
        double secondsLeft = totalSeconds - secondsPassed;
        double percentage = secondsPassed / totalSeconds * 100;   
        
        System.out.println(secondsPassed + " seconds have passed in the day");
        System.out.println(secondsLeft + " seconds are left in the day");
        System.out.println(percentage + " percent of the day has passed");
    }
}