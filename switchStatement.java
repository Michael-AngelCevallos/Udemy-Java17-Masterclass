/* Switch Statements- LETS US TEST IF A VARIABLE MATCHES A PARTICULAR VALUE, AND WILL THEN EXECUTE ONE OR MORE LINES OF CODE IF THE CHECK IS TRUE.
 * 
 * 
 *  TRADITIONAL SWITCH STATEMENT SYNTAX: <------------------------
 *  switch(value){
 *      case x:
 *      // Code for value == x
 *         break;
 *      case y:
 *          // Code for value == y
 *         break;
 *      default:
 *          // code for value not equal to x or y
 * }
 * 
 *  **** VALID SWITCH VALUE TYPES ********
 *  byte, short, int, char, Byte, Short, Integer, Character, String, enum
 * 
 * 
 *  ****** CANNOT USE long, float, double or boolean or their wrappers
 */



public class switchStatement {
    
    public static void main(String[] args) {
        
        int value = 1;

        // FIRST EXAMPLE WITHOUT SWITCH CASE
        // if(value == 1){
        //     System.out.println("Value was 1");
        // } else if(value == 2){
        //     System.out.println("Value was 2");
        // } else {
        //     System.out.println("Was not 1 or 2");
        // }


  //==========================================================================
  //===============Traditional Switch Case====================================      
        int switchValue = 2;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
            // Break stateents are used to stop the rest of the code from running after case has been found    
                break;
            case 2: 
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
                //TEST FOR MULTIPLE CASES, IF TRUE PRINT 
            case 4: case 5: case 6:
            System.out.println("Was a 4, a 5, or a 6");  
            System.out.println("Actually it was a " + switchValue);  
            // IF NO CASES ARE TRUE PRINT
            default:
                System.out.println("Was Not 1 or 2 or 3");
                break;
        }

//=================================================================================
//=================== NEW SWITCH CASE USES =======================================
System.out.println("========= New Switch Case Uses =========");

System.out.println("====Enhanced Switch Statement====");

        switch(switchValue){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
        }
        default -> System.out.println("Was not 1, 2, 3, 4, or 5");
    }
        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
}

    public static String getQuarter(String month){
        // TRADITIONAL WAY TO HANDLE THIS WITH SWITCH STAEMENT
        System.out.println("== Traditional Way to handle String Cases ===");

        switch(month){
            case "January":
            case "February":
            case "March":
                return "1st";
            case "May":
            case "June":
                return "2nd";
            case "July":
            case "August":
            case "September":
                return "3rd";
            case "October":
            case "November":
            case "December":
                return "4th";    
        }
        return "bad";



// ==========ENHANCED SWITH EXPRESSION =======================
        
System.out.println("Enhanced Switch CASE")
    
    
public static String getQuarter2(String month){
    return switch(month){
        case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
        case "APRIL", "MAY", "JUNE" -> "2ND";
        case "OCTOBER", "NOVEMEBER", "DECEMBER" -> "4TH";
        default -> "bad";
    
    };
  
    
}
}
