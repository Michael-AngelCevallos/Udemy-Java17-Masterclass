/*  METHOD CHALLENGE - 
 *  1. THE FIRST METHOD SHOULD BE NAMED displayHighScorePosition
 *  - this method should have 2 parameters, one for the players name, and one for a players position in a high score list
 * 
 * 2. This Method should print a message like "Tim managed to get into position 2 on high score list"
 * 
 * 3. Make a Second Method named calculateHighScorePosition 
 * - this method should have only 1 parameter, the players score
 *  - this method should return a number between 1 and 4, based on the score values shown in this table:
 *      - SCORE GREATER THAN OR EQUAL TO 1000                          1
 *      - SCORE GREATER THAN OR EQUAL TO 500 BUT LESS THAN 1000        2
 *      - SCORE GREATER THAN OR EQUAL TO 100 BUT LESS THAN 500         3
 *      - ALL OTHER SCORES                                             4
 * 
 * 3. FINALLY WE WILL CALL BOTH METHODS AND DISPLAY THE RESULTS FOR THE FOLLOWING SCORES : 1500, 1000, 500, 100, AND 25                                          
 */




public class methodsChallenge {
    public static void main(String[] args) {
        
      


        displayHighScorePosition("Mike", 2);

        // USE THESE FOR FIRST IF STATEMENT IN calculateHighScore Method
        // calculateHighScorePosition(1500);
        // calculateHighScorePosition(1000);
        // calculateHighScorePosition(500);
        // calculateHighScorePosition(100);
        // calculateHighScorePosition(25);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("James", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Ben", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Ralph", highScorePosition);
    }

    // FIRST METHOD
    public static void displayHighScorePosition(String playersName, int positionOnList){
        System.out.println(playersName + " managed to get into position " + positionOnList + " on the players list"); 
    }


    // Second Method 
    public static int calculateHighScorePosition(int playersScore){


        // ** USE THIS IF YOU DONT WANT TO DISPLAY NAME IN MESSAGE
        // if(playersScore >= 1000){
        //     System.out.println("Players bracket is on level 1");
        // } else if(playersScore >= 500 && playersScore < 1000){
        //     System.out.println("Players bracket is on level 2");
        // } else if(playersScore >= 100 && playersScore < 500){
        //     System.out.println("Players bracket is on level 3");
        // }else if(playersScore < 100){
        //     System.out.println("Players bracket is on level 4");
        // }
        // return playersScore;


        // LESSON ANSWER 
        
          if (playersScore >= 1000) {
           return 1;
          } else if(playersScore >= 500 && playersScore < 1000){
           return 2;
          } else if(playersScore >= 100 && playersScore < 500){
           return 3;
          } else {
          return 4;
          }


          // Another way
            // int position = 4;
            // if (playersScore >= 1000) {
            //     position = 1;
            //    } else if(playersScore >= 500 && playersScore < 1000){
            //     position = 2;
            //    } else if(playersScore >= 100 && playersScore < 500){
            //     position = 3;
            //    } else {
            //    return position;
               
          }

        
          
          
          
         
    }

