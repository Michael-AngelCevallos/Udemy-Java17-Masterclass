/* IF THEN ELSE CHALLENGE
 * 
 * 
 * 
 */



public class ifThenElseChallenge {
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(gameOver == true){ // same as 'if(gameOver)' because gameOver is Declared true above
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // The Challenge
        {
            boolean newGameOver = true;

            // 1. SET THE EXISTING SCORE VARIABLE TO 10,000
            int newScore = 10000;
            // 2. SET THE EXISTING levelCompleted VARIABLE TO 8
            int newLevelCompleted = 8;
            // 3. SET EXISTING bonus VARIABLE TO 200
            int newBonus = 200;

            int newFinalScore = newScore;

            // 4. use the same if condition (meaning if gameOver is True) you want to perform calculation, and print out the value of the finalScore variable

            if(newGameOver){
                newFinalScore += (newLevelCompleted * newBonus);
                System.out.println("Your New Final Score is : " + newFinalScore);
            }
        }
    }
}
