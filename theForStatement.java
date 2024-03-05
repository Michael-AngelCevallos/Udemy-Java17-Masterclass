/* The 'FOR' statement (LOOPING) - Looping lets us execute the code a multiple number of times. JAVA supports several statements for lopping, or executing code repetitvely.
 * 
 * 
 * THREE TYPES OF LOOP STATEMENTS AND THEIR USES:
 * 
 * FOR - THE FOR LOOP IS MORE COMPLEX TO SET UP BUT IS COMMOLY USED WHEN YOU ARE 'ITERATING OVER A SET OF VALUES' <----------------
 * 
 * EXAMPLE:
 * for(init; expression; increment){
 * }
 * 
 * ** THE 'INITIALIZATION' SECTION DECLARES OR SETS STATE(INIT), USUALLY DECLARING AND INITIALIZING A LOOP VARIABLE, BEFORE THE LOOP BEGINS PROCESSING
 * 
 * ** THE 'EXPRESSION' SECTION, ONCE IT BECOMES FALSE, WILL END THE LOOP PROCESSING
 * 
 * ** THE 'INCREMENT' SECTION IS EXECUTED AFTER THE EXPRESSION IS TESTED, AND IS GENERALLY THE PLACE WHERE THE LOOP VARIABLE IS INCREMENTED
 * 
 * 
 * WHILE - THE WHILE LOOP 
 * 'EXECUTES UNTIL A SPECIFIED CONDITION BECOMES FALSE.' <---------
 * 
 * DO WHILE - THE DO WHILE LOOP 'ALWAYS EXECUTES AT LEAST ONE AND CONTINUES UNTIL A SPECIFIED CONDITION BECOMES FALSE.' <---------------
 * 
 */






public class theForStatement {
    public static void main(String[] args) {
        
    
    // SIMPLE FOR LOOP TO COUNT FROM 1 TO 5
    for(int counter = 1; counter <= 5; counter++){
        System.out.println(counter);
    }


    // First in parenthisis creates variable, second checks to make sure the rate is less than or equal to 5 point zero, Third increments the rate by 1 after every loop iteration
    for(double rate = 2.0; rate <= 5.0; rate++){
        double interestAmount = calculateInterest(10000.0, rate);
        System.out.println("10,000 at " + rate + " % interest = " + interestAmount);
    }

// MINI CHALLENGE - CREATE A FOR STATEMENT THAT CALLS THE CALCULATEINTEREST METHOD WITH THE DOLLAR AMOUNT OF 100, THIS TIME USE THE INTEREST RATES BETWEEN 7.5 AND 10, BUT INCREMET BY A QUARTER OF A PERCENT EACH TIME, 0.25 PERCENT. PRINT RESULTS TO CONSOLE WINDOW

    System.out.println("======= MINI CHALLENGE =========");

    for(double rate = 7.5; rate <= 10.0; rate += 0.25 ){
        double interestAmount = calculateInterest(100.0, rate);

        // Use a break to break out of a loop and stop at a designated number/word
        if ( interestAmount > 8.5){
            break;
        }
        System.out.println("The Interest Amount for $100 at " + rate + " % intrest = " + interestAmount);
    }


}

    // Creates Method/Function to calculateIntrest Which can e used in our for loops
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    }

