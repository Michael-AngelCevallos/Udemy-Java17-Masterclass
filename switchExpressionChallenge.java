/* Enhanced Switch Statement - use and Challenge
 * 
 * 
 * 
 */



public class switchExpressionChallenge {
    public static void main(String[] args) {

        // Test Case printDayOfWeek (uses Enhanced SWITCH Expression)
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);

        // TEST CASE FOR printWeekDay method (Uses IF/ELSE statement)
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);

    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day){
        case 0 -> {yield "Sunday";}
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day){
        String dayOfWeek = "Invalid Day";
        if(day == 0){
            dayOfWeek = "Sunday";
        } else if (day == 1){
            dayOfWeek = "Monday";
        } else if(day == 2){
            dayOfWeek = "Tuesday";
        } else if(day == 3){
            dayOfWeek = "Wedneday";
        } else if (day == 4){
            dayOfWeek = "Thursday";
        } else if(day == 5){
            dayOfWeek = "Friday";
        } else if(day == 6){
            dayOfWeek = "Saturday";
        } else if(day == 7){
            dayOfWeek = "Sunday";
        } else {
            System.out.println("That is not a day of the week!");
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
