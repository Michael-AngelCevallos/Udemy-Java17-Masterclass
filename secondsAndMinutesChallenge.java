/* SECONDS TO MINUTES CHALLENGE - 
 * 
 * 1. CREATE A METHOD, THAT TAKES TIME, REPRESENTS IN SECONDS, AS A PARAMETER
 * 2. WE'LL THE WANT TO TRANSFER SECONDS INTO HOURS
 * 3. NEXT WE'LL DISPLAY THE TIME IN HOURS , WITH THE REMAINING MINUTES AND SECONDS, IN A STRING
 * 4. WE'LL DO THIS IN 2 STEPS WHICH ALLOWS US TO OVERLOAD OUR METHODS
 * 
 * 5. Both methods return a String in the format shown:
 * 'XX YYm ZZs' - XX represents the numer of hours, YY the number of minutes and ZZ the number of seconds
 * 6. the first method should in turn call the second method to return its results
 * 
 * ** for the first method , the seconds paraeter should be >= 0
 * ** for the second method, the minutes paraeter should be >=0, and the seconds parameter should be >=0, and <=59.
 * 
 * 
 * ** 1 minute = 60 seconds, 1 Hour = 60 minutes, or 3600 seconds
 */



public class secondsAndMinutesChallenge {
    
    public static void main(String[] args) {
        
        // TEST CASES
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds){

        if( seconds < 0){
            return "Invalid data for seconds(" + seconds + "), must be a postive integer value";
        }

        // Two step approach
        
        return getDurationString(seconds / 60, seconds % 60);



        // One Step approach
        // int hours1 = seconds / 3600;
        // System.out.println("hours1 = " + hours1);
        
    }

    public static String getDurationString(int minutes, int seconds){
        
        if(minutes < 0){
            return "Invalid data for minutes(" + minutes + "), must be a postive Integer value";
        }

        if(seconds <= 0 || seconds >= 59){
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

        int hours = minutes/ 60;
        // System.out.println("hours = " + hours);

        int remainingMinutes = minutes % 60;
        // System.out.println("Minutes = " + minutes);
        // System.out.println("Remaining minutes = " + remainingMinutes);

        // int remainingSeconds = seconds % 60;
        // System.out.println("Remaining Seconds = " + remainingSeconds);

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
        
    }

}
