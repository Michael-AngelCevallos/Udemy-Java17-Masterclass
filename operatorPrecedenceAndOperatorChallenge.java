/* OPERATOR PRECEDENCE - (GO TO README FILE TO SEE CHART OF PRECEDENCE) THE WAY JAVA HANDLES OPERATORS IN ORDER OF THEIR PRECEDENCE CHART
 * 
 * 
 * 
 * 
 * OPERATOR CHALLENGE -
 * 
 *  1. CREATE A DOUBLE VARIABLE WITH A VALUE OF 20.00
 *  2. CREATE A SECOND DOUBLE VARIABLE OF TYPE DOUBLE WITH A VALUE 80.00
 *  3. ADD BOTH NUMBERS TOGETHER, THEN MULTIPLY BY 100.00
 *  4. USE THE REMAINDER OPERATOR, TO FIGURE OUT WHAT THE REMAINDER FROM THE RESULT OF THE OPERATION IN STEP THREE AND 40.00, WILL BE
 *  5. CREATE A BOOLEAN VARIABLE THAT ASSIGNS THE VALUE TRUE, IF THE REMAINDER IN   STEP FOUR IS 0.00,  OR FALSE IF ITS NOT ZERO 
 *  6. OUTPUT THE BOOLEAN VARIABLE JUST TO SEE WHAT THE RESULT
 *  7. WRITE AN IF-THEN STATEMENT THAT DISPLAYS A MESSAGE, 'GOT SOME REMAINDER', IF THE BOOLEAN IN STEP FIVE IS NOT TRUE.
 */



public class operatorPrecedenceAndOperatorChallenge {
    public static void main(String[] args) {
        
        // 1. CREATE A DOUBLE VARIABLE WITH A VALUE OF 20.00
            double firstNumber = 20.00D;

        // 2. CREATE A SECOND DOUBLE VARIABLE OF TYPE DOUBLE WITH A VALUE 80.00    
            double secondNumber = 80.00D;

        // 3. ADD BOTH NUMBERS TOGETHER, THEN MULTIPLY BY 100.00    
            double step3 = (firstNumber + secondNumber) * 100;
            System.out.println("This is the answer to step 3:  "  + step3);

        //  4. USE THE REMAINDER OPERATOR, TO FIGURE OUT WHAT THE REMAINDER FROM THE RESULT OF THE OPERATION IN STEP THREE AND 40.00, WILL BE    
            double step4 = step3 % 40.00D;
            System.out.println("This is the answer to step 4 :  "  +  step4);


        //  5. CREATE A BOOLEAN VARIABLE THAT ASSIGNS THE VALUE TRUE, IF THE REMAINDER IN STEP FOUR IS 0.00,  OR FALSE IF ITS NOT ZERO     
            boolean step5 = (step4 == 0) ? true : false;
            
        //  6. OUTPUT THE BOOLEAN VARIABLE JUST TO SEE WHAT THE RESULT
        System.out.println("The answer to step4 = " + step5);    

        //  7. WRITE AN IF-THEN STATEMENT THAT DISPLAYS A MESSAGE, 'GOT SOME REMAINDER', IF THE BOOLEAN IN STEP FIVE IS NOT TRUE.
        
        if(!step5) {
            System.out.println("Got some remainder");
        }
        

        }

    }

