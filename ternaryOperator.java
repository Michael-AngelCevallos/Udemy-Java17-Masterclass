/* Ternary Operator(===) - a shortcut to assigning one of two values to a variable, depending on a given condition.

Known in Java as CONDITIONAL OPERATOR - HAS 3 OPERANDS, ONLY OPERATOR CURRENTELY IN JAVA THAT DOES HAVE THREE
 * 
 * STRUCTURE OF OPERATOR IS:
 * operand1 ? operand 2 : operand3
 * (test if operand1 is true, and if it is it will return operand2, if NOT it wil return operand3 )
 * 
 * **FIRST OPERATION(OPERAND1) IS ALWAYS A BOOLEAN TEST, BUT OPERAND2 AND OPERAND3 DONT NEED TO BE BOOLEAN
 */
public class ternaryOperator {
    public static void main(String[] args) {
        
        {
            boolean isCar = false;
            if(!isCar){
                System.out.println("This is not supposed to happen");
            }
        }

        {
            String makeOfCar = "Volkswagen";

            // This test if make of car is Volkswagen. If the make is Volkswagen it will return value of false(because this is what our second operand is below). If make is not a Volkswagen it will  
            boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
            
            if(isDomestic){
                System.out.println("This car is domestic to our country");
            }

            String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

            System.out.println(s);

        }

        // Another Example -  
        //**Operand1 - ageOfClient >= 18 in this case is the condition we're checking. It needs to return true, or false.

        //**Operand2 - "Over Eighteen" here is the value to assign to the variable ageText, if the condition above is true
        
        // Operand3 - "Still a kid" here is the value to assign to the variable ageText, if the condition above is false.
        
        {
            int ageOfClient = 20;
            String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
            System.out.println("Our client is " + ageText);
        }

        {
            String makeOfCar1 = "Chevy";
            boolean isDomestic = (makeOfCar1 != "Volkswagen");
            System.out.println(isDomestic);
        }
    }
}
