/* Make a method called checkNumber that take in a parameter of a number, 
for 0 >  print "positive";
for 0 < print "negative";
for 0 print zero;
 * 
 * 
 */




public class sampleCodingExercise {
    public static void main(String[] args) {
        
        checkNumber(5);
    }

    public static void checkNumber(int number){
            
        if(number > 0){
            System.out.println("positive");
        } else if(number < 0){
            System.out.println("negative");
        } else if(number == 0){
            System.out.println("zero");
        }
    }
}
