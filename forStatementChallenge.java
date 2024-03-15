/* ** PRIME NUMBERS CHALLENGE-


 * A PRIME NUMBER IS A WHOLE NUMBER ABOVE 1 THAT 'CANNOT' BE MADE BY MULTIPLYING OTHER WHOLE NUMBERS
 * 
 * 8 IS NOT A PRIME NUMBER BECAUSE 2 X 4 = 8
 * 73 IS A PRIME NUMBER BECAUSE BECUASE NO OTHER NUMBERS BESIDES 73 AND 1 CAN GET 73.
 * 
 */


public class forStatementChallenge {
    public static void main(String[] args) {
       
       // Checks and returns Which numbers are prime from 10-50 using our method isPrime
        int count = 0;

        for(int i = 10; i <= 50; i++){
            if(isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                count++;
                if(count == 3){
                    System.out.println("Found 3 - Existing Loop");
                    break;
                }
            }
        }
        System.out.println("Total number of prime numbers between 10 and 50 is " + count);
// =================================================================================


// TEST CASES (NOT FOR USE WITH FOR STATEMENT ABOVE)
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");

        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
    }

    // FIRST MAKE A METHOD TO FIND PRIME NUMBERS
    public static boolean isPrime(int wholeNumber){

        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor < wholeNumber / 2; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }


}
