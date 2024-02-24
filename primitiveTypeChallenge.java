/* PRIMITIVE TYPE CHALLENGE
 * - CREATE FOUR NEW VARIABLES
 * 1. a BYTE VARIABLE,SET IT TO ANY VALID BYTE NUMBER, DOESNT MATTER
 * 2. A SHORT VARIABLE, SET IT TO ANY VALID SHORT NUMBER
 * 3. AN INT VARIABLE SET IT TO ANY VALID INTEGER NUMBER
 * 4. LASTLY CREATE A VARIABLE TYPE LONG. mAKE IT EUAL TO 50,000 PLUS 10 TIMES THE SUM OF THE VALUES OF THE FIRST 3 VARIABLES(YOUR BYTE, YOUR SHORT, AND YOUR INTEGER VALUES). IN OTHER WORDS, USE THE VARIABLE NAES IN YOUR EXPRESSION TO CALCULATE THE SUM. 
 */


public class primitiveTypeChallenge {
     public static void main(String[] args) {
        byte myByteValue = Byte.MAX_VALUE;
        short myShortValue = Short.MAX_VALUE;
        int myIntValue = 50;
        long myLongValue = 
        50000;
        long longTotal =(myByteValue + myShortValue + myIntValue + myLongValue) * 10;

        System.out.println("My Long Value is " + longTotal);
     }
}
