/* METHODS IN JAVA - METHODS GIVE US A WAY TO WRITE CODE ONCE AND THEN RE-USE THE CODE ANYWHERE IN THE PROGRAM. A METHOD DECLARES EXECUTABLE CODE THAT CAN BE INVOKED, PASSED A FIXED NUMBER OF VALUES AS ARGUMENTS.
 * 
 * ** A WAY TO REDUCE CODE DUPLICATION
 * ** A METHOD CAN EXECUTED MANY TIMES WITH DIFFRENT OUTCOMES
 * 
 * 
 * 
 *  *** --> PROCEDURE - METHOD THAT DOES NOT RETURN A VALUE
 *  *** --> FUNCTION - A METHOD THAT DOES RETURN A VALUE
 * 
 *    ----DECLARING METHOD NAMES -----> USE LOWER CAMEL CASE
 */



public class methods {
    public static void main(String[] args) { // MAIN IS A METHOD
        
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
      

        // ** DIFFRENT WAYS TO INVOKE METHOD
        // calculateScore(); // this only works if you make method WITHOUT PARAMETERS


        // Returns 2300, USES amounts from Above, Makes Method a variable that can be added to sout
        int highScore = calculateScore(gameOver, finalScore, levelCompleted, bonus); // THIS WILL FILL IN PARAMETERS WITH GIVEN AMOUNTS IN METHODS
        System.out.println("The High Score is " + highScore);


        // Returns 3400, because new values are stated AFTER method invokation above
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // return a sout with method in sout
        System.out.println("The next High Score is " + 
        calculateScore(gameOver, finalScore, levelCompleted, bonus));



        System.out.println("==========NEW LESSON- Change amounts in Parameters =============");

        calculateScore(true, 800, levelCompleted, bonus);
        calculateScore(true, 10000, 8, 200);

        System.out.println("=========Method with Return Type=======");
        calculateMyAge(1994);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ){  //A Method Declared outside Main Method
        // THIS IS THE METHOD BODY

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            
        }
        return finalScore;
    }

    // Method WITH RETURN TYPE(*NOT VOID), MUST HAVE RETURN STATEMENT
    public static int calculateMyAge(int yearOfBirth){
         
        return (2023 - yearOfBirth);

       
    }

   
}
