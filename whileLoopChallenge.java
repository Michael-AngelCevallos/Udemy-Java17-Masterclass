/* WHILE LOOP CHALLENGE - 

STEP 1 - isEvenNumber - that takes a parameter of type int. its purpose is to determine if the arguent passed to the method is an even number or not.

step 2 - return for the method if it's a even number, otherwise return false
 * 
 * 
 */


public class whileLoopChallenge {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(6));

        System.out.println(isEvenNumber(9));

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;


        while(number <= finishNumber){

            // This will increment out count from 4 by 1
            number++;

            // This will then check to see if new number is odd number, if it is, will continue with code above an increment new nyumber by 1 then return result to terminal
            if(!isEvenNumber(number)){
                oddCount++;
                continue;
            }
                System.out.println("Even number " + number);
                evenCount++;
                if(evenCount >= 5){
                    break;
                }
            }
            System.out.println("Total odd numbers found = " + oddCount);
            System.out.println("Total even numbers found = " + evenCount);
        }
    
    


public static boolean isEvenNumber(int yourNumber){
    if(yourNumber % 2 == 0){
        return true;
    }
    return false;
}
}