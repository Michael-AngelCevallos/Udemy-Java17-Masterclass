/* ABBREVIATING OPERATORS - 
 * 
 * 
 * 
 */



public class abbreviatingOperators {
    public static void main(String[] args) {
        
        // INCREMENT BY 1 USING VARIABLE RE-DECLARATION
        {
            int result = 1;
            result = result + 1;
            System.out.println("result = " + result);
        }

        // SHORTHAND TO INCREMENT BY 1 ( 2 ways , ++ or +=)
        {
            int result = 1;
            // result++; // increments result , returns 2
            result += 4; // does the same as above, increments variable by 1
            System.out.println("Shorthand increment: " + result);


            //SHORTHAND DECREMENT
            {
                int resultMinusOne = 1;
                // resultMinusOne--; // Decrements by 1
                resultMinusOne-= 5; // Does the same as above, use to decrement variable by more then 1
                System.out.println("Shorthand Decrement: " + resultMinusOne);
            }

            // Increment/Decrement Example using decimal('Double' data type)
            {
                double resultDouble = 10;
                resultDouble -= 2.5;
                System.out.println("Double Data Type Example: " + resultDouble); // returns 7.5
            }
        }
    }
    
}
