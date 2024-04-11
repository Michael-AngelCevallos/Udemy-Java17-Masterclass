


import java.util.Scanner;

public class readingInputWithScanner {

    public static void main(String[] args) {
       int currentYear = 2024;
        
         // TRY STATMENT IN THE MAIN METHOD, returns code to console with no errors
      // TRY STATMENT IN THE MAIN METHOD, returns code to console with no errors
      try {
        System.out.println(getInputFromConsole(currentYear));
    } catch (NullPointerException e) {
        System.out.println(getInputFromConsole(currentYear));
    }
}

    public static String getInputFromConsole(int currentYear){

        Scanner scanner = new Scanner(System.in);
        
     // Method to Use WITHOUT SCANNER CLASS
    String name = System.console().readLine("Hi, Whats your name? ");
    System.out.println("Hi " + name + ", Thanks for taking the course!");

    // String dateOfBirth = System.console().readLine("What year were you born? ");
    System.out.println("What year were you born?");

    boolean validDOB = false;
    int age = 0;
    
    do{
        System.out.println("Enter a year of birth >= " + 
        (currentYear - 125) + " and <= " + (currentYear));

    try{
        age = checkData(currentYear, scanner.nextLine());
        validDOB = age < 0 ? false : true;
    }catch  (NumberFormatException badUserData){
        System.out.println("Characters not allowed!!!! Try Again");
    }

     } while (!validDOB);

    
    return "So you are " + age + " years old";

    }
    

    public static int checkData(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return (currentYear - dob);
    }
}
