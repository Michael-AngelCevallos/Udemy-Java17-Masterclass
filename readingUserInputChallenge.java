// Reading User Input Challenge - youll read 5 valid numbers from the console, entered by the user, and print the sum of those five numbers.

// 2. CHECK THAT THE NUMBERS ENTERED, ARE VALID INTEGERS 
// 3. IF NOT PRINT OUT THE MESSAGE, "INVALID NUMBER" to the console, but continue looping, until you DO have 5 VALID Numbers.

// 4. BEFORE THE USER ENTERS EACH NUMBER, PROMPT THEM WITH THE MESSAGE, "ENTER NUMBER #X: ". WHERE X REPRESENTS THE COUNT 1, 2, 3, ETC.

// EXAMPLE : FIRST MESSAGE WOULD LOOK SOMETHING LIKE, "ENTER NUMBER #1", THE NEXT, "ENTER NUMBER #2: ", AND SO ON.

import java.util.Scanner;


public class readingUserInputChallenge {

    public static void main(String[] args) {
        // 1. FIRST SET UP SCANNER CLASS/Object AND VARIABLES IN MAIN
        Scanner scanner =  new Scanner(System.in);

        // This will count when prompted 
        int counter = 1;

        // This sums up all the numbers
        int sum = 0;

        while(counter <= 5){
            System.out.println("Enter number #" + counter + ":");


            // Retrieves data from console as a String
            String nextNumber = scanner.nextLine();

            try{
                int number = Integer.parseInt(nextNumber);
            counter++;
            sum += number;
        } catch(NumberFormatException nfe ){
            System.out.println("Invalid number");
        }
    }

    System.out.println("The sum of the 5 numbers = " + sum);
}
}
