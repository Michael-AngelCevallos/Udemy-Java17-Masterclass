/* ASSIGNMENT OPERATOR(=) VS EQUALS-TO OPERATOR(==) - 
 * 
 * ** ASSIGNMENT OPERATOR(=) - USE WHEN YOU WANT TO AASSIGN THE VALUE OF TRUE/FALSE TO A VARIABLE NAME. 
 * SUCH AS: 
 * boolean newValue = true; 
 * if(newValue = true){
 * System.out.println("This is Assignment operator(=) Example")
 * } 
 * 
 * ** EQUALS-TO OPERATOR(==) - USE WHEN YOU WANT TO EQUAL TO NUMBER/LETTER VARIABLE
 * 
 * 
 */



public class assignmentOperatorVsEqualsToOperator {
    public static void main(String[] args) {
        
        // ASSIGNMENT OPERATOR(=) EXAMPLE. USES BOOLEAN 
        {
            boolean newValue = true;

            if (newValue){
                System.out.println("This is an error");
            }

            {
                int newValue1 = 50;
                if(newValue1 == 50){
                    System.out.println("Our New Value is equal to 50!");
                }
            }
        }
    }
}
