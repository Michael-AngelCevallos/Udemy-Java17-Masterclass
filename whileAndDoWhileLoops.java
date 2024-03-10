/* While and Do While Loops - Use when you want to meet condition, but don't know the range
 * 
 * 
 * WHILE LOOP- CONTINUE EXECUTING CODE BLOCK UNTIL THE LOOP EXPRESSION BECOMES FALSE.
 * 
 * 
 * DO WHILE - EXECUTE THE CODE BLOCK ONCE, THEN CONTINUE EXECUTING UNTIL THE LOOP CONDITION BECOMES 'FALSE'.
 */


 public class whileAndDoWhileLoops {
    public static void main(String[] args) {
        System.out.println("======For Loop Example======");
        // FOR LOOP PRINT 1 THROUGH 5
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("=====While Loop Example====");
        // WHILE LOOP FIRST STEP For example, if we want to ask a user for a number between 1 and 10, we don't know how many times the user may enter a larger number, so we keep asking "while the number is not between 1 and 10".
        int j = 1;

        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }

        // DO WHILE LOOP , USE THIS IF YOU WANT TO EXECUTE CODE ATLEAST ONCE WITH A CONDITION THAT A VARIABLE IS TRUE. 
        //** EXAMPLE WHEN TO USE, WHEN YOU WNAT TO ASK FOR A USERS USERNAME AND PASSWORD. YOU WANT THEM TO ENTER IT THE FIRST TIME, AND IF ITS INCORRECT YOU'LL WANT TO CONTINUE ASKING FOR THE INFORMATION(UP TO A CERTAIN AMOUNT OF TIMES), ALLOWING THE TO HOPEFULLY, AT SOME POINTY REMEMBER IT.
        System.out.println("==== Do While Loop ====");
        boolean isReady = true;
        do {
            if(j > 5){
                break;
            }
            System.out.println(j);
            j++;
        } while(isReady);

        System.out.println("==== While Loop  With Contiunue Statement ====");

        // create a loop that goes through the number 0 to 50, incrementing by 5 at the start of each loop iteration.

        int number = 0;

        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.println(number + "_");
        }

    }
}
