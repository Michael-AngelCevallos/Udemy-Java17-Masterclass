/* While and Do While Loops - USE WHEN YOU WANT TO LOOP UNTIL A CONDITION IS MET, THATS NOT ASSOCIATED WITH A KNOWN RANGE OF VALUES.
 * 
 * 
 * ** WHILE LOOP - CONTINUES EXECUTING CODE BLOCK 'UNTIL THE LOOP EXPRESSION BECOMES FALSE'.
 * 
 *  ** DO WHILE LOOP - 'EXECUTE THE CODE BLOCK ONCE', 'THEN CONTINUE EXECUTING UNTIL THE LOOP CONDITION BECOMES FALSE'. ** USE A DO WHILE TO CHECK A USERNAMES AND PASSWORD **. 
 * 
 * ** CONTINUE STATEMENT -  WILL STOP EXECUTING THE CURRENT ITERATION OF A BLOCK OF CODE IN A LOOP, AND START A NEW ITERATION
 */

 public class whileAndDoWhileLoops{



    public static void main(String[] args) {
        

        // SIMPLE FOR LOOP TO PRINT THROUGH NUMBERS 1-5
        // ** FOR LOOPS HAVE 3 DECLARATIONS (INIT; EXPRESSION; INCREMENT)
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

//====================================================================================
     System.out.println("==== While Loop First Example ====");
// WHILE LOOP 

      int j = 1;
      while(j <= 5){
        System.out.println(j);
        j++;
      }
//===========================================================================
      System.out.println("=== While Loop Second Example (BREAK AND TRUE/FALSE) ====");

      int k = 1;
      while (true) {
        if(k > 5){
            break;
        }
        System.out.println(k);
        k++;
      }

      //==============================================================================
      // USE TO TEST CONDITION RETURN 
      
      System.out.println("==== While Loop With Boolean =====");

      int p = 1;
      boolean isReady = true;
      while(isReady){
        if (p > 5){
            break;
        }
        System.out.println(p);
        p++;
      }
// ===================================================================================

// Do While Loop - runs code first, then checks to see if condition is true or false
      System.out.println("===== DO WHILE LOOP ======");

      int b = 1;
      boolean bool = false;
      do {
        if ( b > 5){
            break;
        }
        System.out.println(b);
        b++;
      } while (bool);

      //===========================================================================
      System.out.println("=== While Loop with Continue Statement ====");


      int number = 0;

      while(number < 50){

        // THIS RETURNSIN INCREMENTS OF 5
        number += 5;

        // SKIPS NUMBERS RETURNED IF THEY ARE DIVISIBLE BY 25
        if(number % 25 == 0){
            continue;
        }
        System.out.println(number + "_");
      }
    }
 }






 