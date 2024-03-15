
// CASTING - TO TREAT OR CONVERT A NUMBER, FROM ONE TYPE TO ANOTHER. WE PUT THE TYPE WE WANT THE NUMBER TO BE, IN PARENTHESES LIKE THIS
// (byte) (myMinByteValue / 2);

public class casting {


    public static void main(String[] args) {
        int myMinByteValue = Byte.MIN_VALUE;
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        System.out.println(myNewByteValue);
    }
}
