/* CHAR AND BOOLEAN PRIMITIVE TYPES - 
 * 
 * *** Char - Stores one and ONLY ONE , character. Declare by using SINGLE quotes only. Example : char myChar = 'D'; ***
 *  ***!!! WHY USE CHAR?? - AN EXAMPLE WOULD BE TO STORE THE LAST KEY PRESSED BY A USER IN A VIDEO GAME, OR TO LOOP PROGRAMMATICALLY THROUGH THE LETTERS IN AN ALPHABET !!!***
 * 
 * 
 * BOOLEAN USED TO REPRESENT TRUE OR FALSE. EXAMPLE: boolean isTheCustomerOverTwentyOne = true;
 * 
 * ** IMPORTANT: WHEN DECLARING BOOLEAN VARIABLES IT IS COMMON PRATICE TO NAME VARIABLE IN THE FASHION OF A QUESTION. EXAMPLE: isCustomerOverTwentyOne, hasValidDriversLicense, isMarried; **
 */

public class charAndBoolean {
    public static void main(String[] args) {
        char myChar = 'D'; // Our Value for D
        char myChar2 = '\u0044'; // unicode Value for D
        char myChar3 = 68; // Numeric Value for D

        System.out.println("These Represent my char's for D");
        System.out.println(myChar);
        System.out.println(myChar2);
        System.out.println(myChar3);

System.out.println(" ");// creates space in terminal


        // Char Challenge : Create three varaiables to store the character for the question-mark symbol
        char questionMark = '?';
        char questionMark2 = '\u003F';
        char questionMark3 = 63;

System.out.println("These represent my char output for Question Mark Challenge: ");
System.out.println("Char using '?' is: " + questionMark + " , Char using unicode is: " + questionMark2 + " , Char using the number is: " + questionMark3);



// BOOLEAN PRIMITIVES LESSON

System.out.println(" "); // CREATES SPACE

boolean myFalseBoolean = false;
boolean isTheCustomerOverTwentyOne = true;


System.out.println(myFalseBoolean);

System.out.println(isTheCustomerOverTwentyOne);
        
    }
}
