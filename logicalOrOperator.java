/* Logical 'OR' Operator(||) - works similar to 'AND'(&&) operator, but the diffrence with 'OR'(||) is it only requires one condition to be true.
 * 
 * ** Also (|) represents or but on the bitwise level.***
  */



public class logicalOrOperator {
    public static void main(String[] args) {

        // Returns "You Got the High Score" && "Either ONE or BOTH conditions are true"

        {
            int topScore = 80                                  ;
            if( topScore < 100) {
                 System.out.println("You got the High Score !");
            }

            {
                int secondTopScore = 81;
                if ((topScore > secondTopScore) && (topScore < 100)){
                    System.out.println("Greater than second top score and less than 100");
                }

                if ((topScore > 90) || (secondTopScore <= 90)){
                    System.out.println("Either ONE or BOTH Conditions Are True");
                }
            }
        }
    }
}
