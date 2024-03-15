/* Local Variables and Scope - 
 * 
 * ** Local Variables are called local, because it is available for use by the code block in which it was declared. LOCAL VARIABLES ARE ALWAYS OUT OF SCOPE, FOR OUTER BLOCKS, OR THE CONTAINING BLOCKS THEY ARE DECLARED IN
 * 
 * 
 * *** it is best practice to declare and initialize variables in the same place if possible.
 * and to declare variables in the narrowest scope possible.
 */


public class localVariablesAndScope {
    
// LOCAL VARIABLE EXAMPLE
    { // STARTS ON OUTER BLOCK - FOR EXAMPLE A METHOD BLOCK

        int firstVariable = 5;
        int secondVariable = 10;

        if ( firstVariable > 0){  // flow statement block starts inner block

            // INNER BLOCK CODE HAS ACCESS TO OUTER BLOCKS 
            System.out.println(secondVariable);
        }
    }
}
