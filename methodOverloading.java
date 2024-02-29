/* Method Overloading - occurs when a class has multiple methods, with the same name, but the methods are declared with diffrent parameters
 * 
 * So you can execute a method with one name, but call it with diffrent arguments
 * 
 */



public class methodOverloading {
    

    public static void main(String[] args) {
        // This returns 'Player Mike scored 500 points'
        // calculateScore("Mike", 500);

        // This returns the return value of 'score * 1000' from method below
        int newScore = calculateScore("Mike", 500);
        System.out.println("New Score is " + newScore);


        // ------ Second Method with only SCORE parameter
        calculateScore(75);

        // ---------Third Method NO parameters
        calculateScore();

        // * CAN ALSO INVOKE METHODS WITHIN SOUT
        System.out.println("New score is " + calculateScore("Alex", 500));
        System.out.println("New Score is " + calculateScore(10));
    }

    public static int calculateScore(String playerName, int score){
        
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        
        System.out.println("Unnamed Player has " +  score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player detected, no player score.");
        return 0;
    }


}
