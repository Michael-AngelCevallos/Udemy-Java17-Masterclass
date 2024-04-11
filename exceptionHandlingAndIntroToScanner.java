/* EXCEPTION HANDLING, INTRO TO SCANNER, TRY STATEMENTS - 
 * 
 * 
 * **** WHATS AN EXCEPTION? AN EXCEPTION IS AN ERROR THAT HAPPENS IN CODE. SOME TYPES OF ERRORS CAN BE PREDICTED
 * 
 * 
 *  ** TRY STATEMENT- THE TRY STATEENT HAS 2 CODE BLOCKS. THE 1ST IS DECLACRED DIRECTLY AFTE THE 'TRY' KEYWORD, AND THIS CODE BLOCK ENDS, AND IS FOLLOWED BY THE DECLARATION ODF THE 'CATCH' KEYWORD.
 * 
 * 
 *  ** The 'Catch' keyword - includes the declaration of variables, in parenthisis, and then has its own code block
 * 
 *  try{
 *      // statements that might get errors
 * } catch (Exception e){ <----- (e is the variable name)
 *      // code to 'handle' the exception 
 * }
 * 
 * 
 *  *** SCANNER CLASS = THE SCANNER CLASS IS DESCRIBED AS AS SIMPLE TEXT SCANER, WHICH CAN PARSE PRIMITIVE TYPES.
 * 
 * TO USE THE SCANER CLASS, WE HAVE TO CREATE AN INSTACE OF SCANNER( THIS IS THE SAME AS CREATING AN OBJECT OF SCANNER)
 * 
 * ** USE THE KEYWORD 'new' to do it. Example: 
 * 
 * ClassName variableName = new ClassName();
 * 
 *  WE CAN ALSO PASS PARAMETERS IN THE PARENTHISIS. EXAMPLE
 * ClassName variableName = new ClassName(argument1, argument2);
 * 
 * 
 * ** READING INPUT FROM THE CONSOLE USING SCANNER. EXAMPLE:
 * 
 * Scanner sc = new Scanner(System.In)
 * 
 * 
 * ** scanner.nextLine(); --- Reads users input and stores it mikemik
 */

import java.util.Scanner;

public class exceptionHandlingAndIntroToScanner {
    public static void main(String[] args) {
        
    int currentYear = 2024;

    // TRY STATMENT IN THE MAIN METHOD, returns code to console with no errors
        try{
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){

        }
   
        
    
}

public static String getInputFromConsole(int currentYear){

//================================================================================
   

    // Method to Use WITHOUT SCANNER CLASS
    // String name = System.console().readLine("Hi, Whats your name? ");
    // System.out.println("Hi " + name + ", Thanks for taking the course!");

    // String dateOfBirth = System.console().readLine("What year were you born? ");
    // int age = currentYear - Integer.parseInt(dateOfBirth);


    // return "So you are " + age + " years old";

 //================================================================================
 
 //============= SCANNER CLASS METHOD ========================================//

 Scanner scanner = new Scanner(System.in);

 System.out.println("Hi, What's your Name?");
 String name = scanner.nextLine();

 System.out.println("Hi " + name + ", Thanks for taking my course!");

 System.out.println("What year were you born? ");
String dateOfBirth = scanner.nextLine();
int age = currentYear - Integer.parseInt(dateOfBirth);

 

 if(age < currentYear){
        return "You are not born yet";
    } else{
        return "So you are " + age + " years old."; 
    }
       
 }
}

