import com.sun.jdi.PathSearchingVirtualMachine;

/** IF-THEN STATEMENT - MOST BASIC OF ALL THE CONTROL FLOW STATEMENTS. IT TELLS YOUR PROGRAM TO EXECUTE A CERTAIN SECTION OF CODE, ONLY IF A PARTICULAR TEST EVALUATES TO 'TRUE'. THIS IS KNOWN AS 'CONDITIONAL LOGIC' <----------!!
 *
 * - CONDITIONAL LOGIC USES SPECIF STATEMENTS IN JAVA TO ALLOW US TO CHECK A CONDITION, AND EXECUTE CERTAIN CODE BASED ON WHETHER THAT CONDITION (THE EXPRESSION) IS TRUE OR FALSE.
 *
 * - EQUALITY OPERATOR ('==') - used to determine if 2 operands are CONSIDERED EQUAL, AND RETURNS A BOOLEAN VALUE. to each other. IN OTHER WORDS IS THE LEFT OPERAND(VARIABLE) EQUAL IN VALUE TO THE RIGHT OPERAND. eXAMPLE: isAlien = false; isAlien == false; - is asking if the value is true or false.
 *
 * */



public class ifThenStatment {

    public static void main(String[] args) {
        boolean isAlien = false;

        if (isAlien == false)
            System.out.println("It is not an Alien!");

    }
}
