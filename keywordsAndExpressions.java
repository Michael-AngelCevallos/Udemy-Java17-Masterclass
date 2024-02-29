/* Keywords and Expressions in Java - KEYWORDS ARE 51 RESERVED WORDS THAT JAVA HAS FUNCTIONALITY FOR 
 * 
 * 
 *  ** EXPRESSION - AN EXPRESSION COMPUTES TO A SINGLE VALUE.
 *  ** STATEMENT - STATEMENTS ARE STAND ALONE UNITS OF WORK
 *  ** CODE BLOCKS - A CODE BLOCK IS A SET OF ZERO , ONE, OR MORE STATEMENTS, USUALLY GROUPED TOGETHER IN SOME WAY TO ACHIEVE A SINGLE GOAL.
 * 
 * 
 */




public class keywordsAndExpressions {
    public static void main(String[] args) {

        // Statement
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if(highScore > 25){
            highScore = 1000 + highScore;   // adds bonus points
        }
        System.out.println(highScore);

        int health = 100;

        if((health < 25) && (highScore > 1000)){
            highScore = highScore - 1000;
        }
        

    }
}
