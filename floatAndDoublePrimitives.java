/* Floating point numbers are numbers that use decimals. Use the 'float' primitive type to declare variable with decimals. MIN_VALUE= 1.4E-45 through MAX_VALUE= 3.4028235E38.
 * 
 * Double primitive type is also used to declare variables with decimals. 'double' is Java's go to for decimal numbers. Use double to declare very large decimal numbers such as MIN_VALUE= 4.9E-324 through MAX_VALUE= 1.7976931348623157E308;
 * 
 * 'E' is used like a carrot (^) to represent to the power of.
 *  Use the characted D or d after your Double variable amount. Example: double myDouble= 5D;
 *  Use F for float. Example float myFloat= 5F;
 * 
 * **IMPORTANT - DOUBLE IS JAVAS DEFAULT FOR DECLARING NUMBERS WITH DECIMALS. USE DOUBLE OVER FLOAT!!!!**
 */


public class floatAndDoublePrimitives {
    public static void main(String[] args) {
        
        int myIntValue1 = 5;
        float myFloatValue1 = 5F;
        double myDoubleValue1 = 5D;

        // To avoid error for not using 'F' at the end of variable amount for float we can cast float into variable amount, NOT RECOMMENDED
        float floatCastingExample = (float) 5.25;




        // PRINTS OUT MAX MIN VALUES FOR FLOAT AND DOUBLE PRIMITIVE TYPES
        System.out.println("Float Value Range (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
        System.out.println("Double Value Range (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");

        System.out.println("This is my int value: " + myIntValue1);
        System.out.println("This is my float value: " + myFloatValue1);
        System.out.println("This is my double value: " + myDoubleValue1);
        System.out.println("This is my float casting example: " + floatCastingExample);

    }
}
