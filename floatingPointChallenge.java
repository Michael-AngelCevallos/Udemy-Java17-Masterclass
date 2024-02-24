/* FLOATING POINT PRECISION CHALLENGE
 * 
 * CHALLENGE: CONVERT A GIVEN NUMBER OF POUNDS TO KILOGRAMS
 * 1. CREATE A VARIABLE WITH THE APPROPRIATE TYPE, TO STORE THE NUMBERS OF POUNDS THAT WE WANT TO CONVERT INTO KILOGRAMS
 * 2. CALCULATE KILOGRAmS, USING THE VARIABLE ABOVE, AND STORE THE RESULT IN A 2ND APPROPRIATELY TYPED VARIABLE
 * 3. PRINT THE RESULT
 * 
 * ** DONT FORGET TO USE THE CONVERSION FORMULA: 1 POUND IS EQUAL TO 0.45359237 OF A KILOGRAM**
 * 
 * 
 * 
 * ** WHY USE DOUBLE OVER FLOAT? 1. FASTER TO PROCESS ON MANY MODERN COMPUTERS, 2. JAVA LIBRARIES, MATH FUNCTIONS ARE OFTEN WRITTEN TO PROCESS DOUBLES OT FLOATS, AND RETURN THE RESULT AS A DOUBLE, 3. CREATORS OF JAVA SELECTED THE DOUBLE BECAUSE IT'S MORE PRECISE, AND IT CAN HANDLE A LARGER RANGE OF NUMBERS**
 * 
 */



public class floatingPointChallenge {
       

        public static void main(String[] args) {
            int myIntValue2 = 5 / 2; // returns 2 (Whole Number because its an Integer Type)
            float myFloatValue2 = 5F / 2F; // returns 2.5
            double myDoubleValue2 = 5D / 2D; // returns 2.5

            float myFloatValue3 = 5F / 3F; // returns 1.6666666
            double myDoubleValue3 = 5D / 3D; // returns 1.6666666666666667 (more precise)

            // ALSO PRINTS SAME AS ABOVE
            // myDoubleValue3 = 5.00 / 3; // returns 1.6666666666666667 (more precise)


            System.out.println(myIntValue2); 
            System.out.println(myFloatValue2); 
            System.out.println(myDoubleValue2); 
            System.out.println(myFloatValue3); 
            System.out.println(myDoubleValue3); 

            // START OF CHALLENGE

            //1. CREATE A VARIABLE WITH THE APPROPRIATE TYPE, TO STORE THE NUMBERS OF POUNDS THAT WE WANT TO CONVERT INTO KILOGRAMS
            double numberOfPounds = 200D;

            //2. CALCULATE KILOGRAmS, USING THE VARIABLE ABOVE, AND STORE THE RESULT IN A 2ND APPROPRIATELY TYPED VARIABLE
            double myPoundsToKilograms = numberOfPounds * 0.45359237D;

            System.out.println("Amount of Kilograms: " + myPoundsToKilograms);
        }
        
}
