/*  Digit Sum Challenge - Write a method, called sumDigits, that has a single parameter named number, with the parameter type int, and should return an int.
 * 
 * 2. IF A NEGATIVE NUBER IS PASSED, IT SHOULD RETURN -1, MEANINGAN INVALID VALUE WAS PASSED.
 * 
 * 3. THE METHOD SHOULD PARSE OUT EACH DIGIT FROM THE NUMBER, AND SUM THE DIGITS UP.
 * 
 * 4. SO IF THE 125 IS THE VALUE PASSED TO THE METHOD, THE CODE SHOULD RETURN SUM DIGIT, IN THIS CASE, 1 + 2 + 5, AND RETURN 8, AS A VALUE.
 * 
 * 5. AND ANOTHER EXAMPLE, IF THE VALUE IS 1000, THE CODE SHOULD SUM EACH DIGIT, 1 + 0 + 0 + 0, AND RETURN 1 AS A VALUE;
 * 
 * 6. IF THE NUMBER IS A SINGLE DIGIT NUMBER, SIMPLY RETURN THE NUMBER ITSELF AS THE RESULT
 * 
 * 
 * 
 */



public class digitSumChallenge {
    public static void main(String[] args) {
        

        System.out.println("The sum  of digists in number 1234 is " + sumDigits(1234));
        System.out.println("The sum  of digists in number -125 is " + sumDigits(-125));
        System.out.println("The sum  of digists in number 4 is " + sumDigits(4));
        System.out.println("The sum  of digists in number 32123 is " + sumDigits(32123));
    }

    public static int sumDigits(int number){
        if(number < 0){
            return -1;
        } 

        int sum = 0;

        while(number > 9){
            sum += (number % 10);
            number = number / 10; 

        }

        sum += number;

        return sum;
        }
    }

