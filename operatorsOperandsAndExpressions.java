/*  OPERATORS, OPERANDS, AND EXPRESSIONS 
 * 
 *  - OPERATORS - SPECIAL SYMBOLS THAT PERFORM SPECIFIC OPERATIONS ON ONE, TWO, OR THREE OPERANDS, AND THEN RETRUN A RESULT.
 * 
 *  - OPERAND - A TERM USED TO DESCRIBE AY OBJECT THAT IS MANIPULATE BY AN OPERATOR. CAN BE A NUMBER OR A VARIABLE NAME.
 * 
 *  - EXPRESSION - IS FORM ED BY COMBINING VARIABLES, LITERALS, METHOD RETURN VALUES, AND OPERATORS. EXAMPLE: int myVar = 15 + 12;  // 15 + 12; is the EXPRESSION
*/






public class operatorsOperandsAndExpressions {
    
    public static void main(String[] args) {
        
        char firstChar = 'A'; char secondChar = 'B';

        System.out.println(firstChar + secondChar); // returns 131, becuase it added there number values

        System.out.println("" + firstChar + secondChar);// returns AB, becuase it is coverted to string when we added ""



        System.out.println("");
        System.out.println("Changing Up Variables with same name example: ");
        //Changing up variables with same name
        int result = 2;
        System.out.println(result); //returns 2

        result = result * 10; // retuens 20
        System.out.println(result);

        result = result / 4; // returns 5, because reuslt has been changed to 20 in previous line

        System.out.println("");
        // **!! - REMAINDER OPERATOR - IS REPRESENTED WITH '%' SIGN. GOES BY THE NAME OF MODULUS/ MODULO/ MOD. ** RETURNS THE REMAINDING VALUE FROM A DIVISION OPERATION. ** IF THERE IS NO REMAINING VALUE, THE RESULT WITH BE 0.**

System.out.println("Remainder/Modulo/Modulus Operator(%) Examples: ");

        int moduloExample1 = 10 % 5; //returns 0, because there is no remainder. 10 / 5 result in an even number.
        int moduloExample2 = 10 % 3; // returns 1, because 10 / 3 is 3 with a remainder of 1

        System.out.println(moduloExample1);
        System.out.println(moduloExample2);



    
    }
}
