/* PARSING VALUES AND READING INPUT USING SOUT -
 * 
 * WERE GOING TO CREATE AN INTERACTIVE APPLICATION, WHERE A USER WILL ENTER THEIR NAME, AND YEAR OF BIRTH, AND THEN THE APPLICATION WILL CALCULATE THE CURRENT AGE OF THE USER.
 * 
 * 
 * WHEN WE READ DATA IN, OR FROM USER INPUT, IT'S COMMON FOR THE DATA TO BE INITIALLY A STRING, WHICH WE WILL NEED TO CONVERT TO NUMERIC VALUE. 
 * 
 * 
 *  ****.parseInt()  <--------- Turns a String into a Integer
 * 
 */



public class parsingValuesAndReadingInputUsingSout {
    
    public static void main(String[] args) {
        int currentYear = 2024;
        String usersDateOfBirth = "1999";
        
        // This Converts the Variable String users Date of birth to an int so it can be subtracted in the sout below
        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user says he's " + ageWithPartialYear);

         //=========================================================================
         System.out.println("=== User Input Example System.console Method ====");
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
       

    }
Mike
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, Whats your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){
        return "";
    }
}
