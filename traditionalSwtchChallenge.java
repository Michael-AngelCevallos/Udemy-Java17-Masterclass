/*   Traditional Switch Challenge - in this challenge , we'll be using the NATO alphabet to replace a character or letter, with NATO's standardized word for that letter.
 * 
 * NATO phonetic alphabet
 * A = Able, B = Baker,C = Charlie, D = Dog, E = Easy, F = Fox, G = George, H = How, I = Item, J = Jig, K = King, L = Love, M = Mike, N = Nan, O = Oboe, P = Peter, Q = Queen, R = Rogers, S = Sugar, T = Tare, U = Uncle, V = Victor, W = Willia, X = X-ray, Y = Yoke, Z = Zebra
 * 
 * 
 * 1. Create a new Char Variable
 * 2. Use the traditional Switch Statement (with colon in case labels) that tests the value in the variable from Step 1.
 * 3. Create Cases for characters: A, B, C, D, and E.
 * 4. Display a message in each case block, with the letter and the NATO word, then break.
 * 5. Add a default block, which displays the letter with a message saying not found.
 */




public class traditionalSwtchChallenge {
    

    public static void main(String[] args) {
        char charValue = 'A';
        switch( charValue){
            case 'A':
            System.out.println("A is Able");
            break;
            case 'B':
            System.out.println("B is Baker");
            break;
            case 'C':
            System.out.println("C is Charlie");
            break;
            case 'D':
            System.out.println("D is Dog");
            break;
            case 'E':
            System.out.println("E is Easy");
            break;
            default:
            System.out.println("Letter " + charValue + " was not foiund in the switch statement");
        }   

    }
}
