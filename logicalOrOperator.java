public class logicalOrOperator {
    public static void main(String[] args) {
        {
            int topScore = 150;
            if( topScore < 100) {
                 System.out.println("You got the High Score !");
            }

            {
                int secondTopScore = 81;
                if (topScore > secondTopScore && topScore < 100){
                    System.out.println("Greater than second top score and less than 100");
                }
            }
        }
    }
}
