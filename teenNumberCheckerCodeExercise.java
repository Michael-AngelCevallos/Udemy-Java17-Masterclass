/* TEEN NUMBER CHECKER EXERCISE - The objective of this coding exercise is to write a small program that checks if a number is a "teen" number, meaning if it's between 13 and 19.
 * 
 * 
 *  ***UDEMY SOLUTION : 
 * 
 * public class TeenNumberChecker {
    // write code here
    
    public static boolean hasTeen(int num1, int num2, int num3){

        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num){
        return num >= 13 && num <= 19;
    }
}
 * 
 */



public class teenNumberCheckerCodeExercise {
    public static void main(String[] args) {
        
    }

    public static boolean hasTeen(int num1, int num2, int num3){

        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num){
        return num >= 13 && num <= 19;
    }
}
