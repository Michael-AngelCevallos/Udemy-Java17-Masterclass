/* Shared Digit Code -
 * 
 * The objective of this coding exercise is to write a small program that checks if there's a digit that appears in both numbers.
 * 
 * 
 * Shared Digit
Write a method named hasSharedDigit with two parameters of type int. 

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.



EXAMPLE INPUT/OUTPUT:

hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers



NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
 * 
 */





public class sharedDigitCodeExercise {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }


    public static boolean hasSharedDigit(int num1, int num2) {
        // Check if numbers are within the range
        if (!isValidRange(num1) || !isValidRange(num2)) {
            return false;
        }

        // Extract digits of num1
        int digit1Num1 = num1 % 10;
        int tensDigitNum1 = num1 / 10;

        // Extract digits of num2
        int digit1Num2 = num2 % 10;
        int tensDigitNum2 = num2 / 10;

        // Check if any digit of num1 matches any digit of num2
        return digit1Num1 == digit1Num2 || digit1Num1 == tensDigitNum2 || tensDigitNum1 == digit1Num2 || tensDigitNum1 == tensDigitNum2;
    }

    public static boolean isValidRange(int num) {
        return num >= 10 && num <= 99;
    }

}
