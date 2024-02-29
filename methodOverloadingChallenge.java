/* METHOD OVERLOADING CHALLENGE -
 * 
 * 1. CREATE 2 METHODS WITH THE SAME NAME : convertToCentimeters
 * 2. THE FIRST METHOD HAS 1 PARAMETER OF TYPE INT, WHICH REPRESENTS THE ENTIRE HEIGHT IN INCHES. YOU'LL CONVERT INCHES TO CENTIMETERS, IN THIS METHOD, AND PASS BACK THE NUMBER OF CENTIMETERS, AS DOUBLE
 * 3. THE SECOND METHOD HAS 2 PARAMETERS OF TYPE INT, ONE TO REPRESENT HEIGHT IN FEET, AND ONE TO REPRESENT THE REMAINING HEIGHT IN INCHES. SO IF A PERSON IS 5 FOOT, 8 INCHES, THE VALUES 5 FOR FEET AND 8 FOR INCHES WOULD BE PASSED TO THIS METHOD. THIS METHOD WILL CONVERT FEET AND INCHES TO JUST INCHES, THEN CALL THE FIRST METHOD, TO GET THE NUMBER OF CENTIMETERS, ALSO RETURNING THE VALUE AS A DOUBLE.
 * 
 * 
 */



public class methodOverloadingChallenge {
    
    public static void main(String[] args) {
        
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

        convertToCentimeters(6,9);
    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    // public static double convertToCentimeters(int feet, int inches){
        // We Multiply the value of feet(feet * 12) to get inches from feet, then we add inches( + inches) to add on any inches in the inches parameter, then we multiply by 2.54 for the conversion 
    //     return ((feet * 12) + inches) * 2.54;
    // }

    // METHOD OVERLOADING WITH PASSING THROUGH OTHER METHODS EXAMPLE
    // public static double convertToCentimeters(int feet, int inches){
    //     return convertToCentimeters((feet * 12) * inches);
    // }

    // ADDING LOCAL VARIABLES METHOD - Preffered
    public static double convertToCentimeters(int feet, int inches){
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;

    }
}
