/* Sum 3 and 5 Challenge -
 * 1. Create a FOR loop using a range of numbers from 1 to 1000 inclusive
 * 2. SUM all the numbers that can be divided by both 3 and 5
 * 3. PRINT out the numbers that have met the above conditions
 * 4. BREAK out of the loop once you have found 5 numbers that met the condition
 * 5. After breaking out of the loop, print the sum of the numbers that met the conditions above
 * 
 * ** NOTE: TYPE ALL THE CODE IN THE MAIN METHOD
 */


public class sumThreeAndFiveChallenge {

    public static void main(String[] args) {
        // 1ST STEP, CREATE 2 VARIABLES TO ACCOUNT FOR COUNT OF MATCHES, AND SUM OF MATCHES
        int countOfMatches = 0;
        int sumOfMatches = 0;

        // 2ND WRITE A FOR LOOP THAT WILL ITERATE THROUGH NUMBERS 1 AND 1000, AND INCREMENT BY 1. WE CREATE THE VARIABLE LOOPNUMBER WITHIN THE PARENTHISIS 
        for(int loopNumber = 1; loopNumber <= 1000; loopNumber++){

        // 3RD WRITE IF STATEMENT THAT WILL LOOP THROUGH NUMBERS AND RETURN ONLY NUMBERS DIVISIBLE BY 3 AND FIVE(== 0 MEANS RETURN IF TRUE)    
            if((loopNumber % 3 == 0) && (loopNumber % 5 == 0)){

                // 4TH INCREMENT THE COUNT OF MATCHES BY 1
                countOfMatches++;

                //5TH  ADDS THE SUM OF MATCHES TO THE LOOPED NUMBER
                sumOfMatches += loopNumber;

                //6TH PRINTS STATEMENT TO TERMINAL, 
                System.out.println("Found a match = " + loopNumber);
            }
            // 7TH IF STATEMENT TO RETURN ONLY FIRST 5 MATCHES TO TERMINAL AND THEN BREAK OUT OF PROGRAM
            if (countOfMatches == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sumOfMatches);
    }
}
