/* if else
 * 
 * 
 * 
 * 
 */



public class ifElseIfElseStatements {
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 2500;
        int levelCompleted = 5;
        int bonus = 100;

        if(score == 5000){
            System.out.println("Your score was 5000!");
        }


        {
            if(score == 5000){
                System.out.println("Your Score is 5000");
            } else {
                System.out.println("Your score is NOT 5000");
            }
        }

        {
            if (score < 5000){
                System.out.println("Your scrore was less than 5000");
            } else {
                System.out.println("Got Here");
            }
        }


        // if-else if-else statement 
        {
            if(score < 5000 && score > 1000){
                System.out.println("Your Score was less than 5000 but greater than 1000");
            } else if (score < 1000) {
            } else {
                System.out.println("Got Here");
            }
        }

    }
}
