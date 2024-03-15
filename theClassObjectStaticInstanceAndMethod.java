/* The class , The object, Static and Instance fields, and Methods- 
 * 
 * - Local Variables are a way to store and manipulate temporary data.
 * 
 *  - In addition to local variables, we can set up data to be defined, and used as part of a class, or an object.
 * 
 * - First, ATTRIBUTES on classes is another way to store data.
 * - Second , We will be introduced to some static methods on the wrapper classes, which are classes we previously looked at, but havent used any methods on these classes yet.
 *  - These methods will help parse strings into numberic value.
 *  - Finally, will be introduced to a special class for reading input,which we'll in the last part of this section, to create an interactive program.
 * 
 * 
 * ** A CLASS CAN BE DSCRIBED AS:
 *  - A CUSTOM DATA TYPE.
 *  - A SPECIALCODE BLOCK THAT CONTAINS METHODS
 * 
 *  ** THINK OF A CLASS AS AN EMPTY FORM THAT GETS HANDED OUT IN CLASS, (JUST HAS FIELD FOR NAME AND ADDRESS), THE OBJECT IS LIKE THE FORM ONCE ITS BEEN HANDED OUT AND FILED IN, EACH OBJECT WILL HAVE UNIQUE VALUES FOR THE FORM DATA BEING COLLECTED.
 * 
 * 
 * ** THE CLASS MAY HAVE FIELDS FOR ADDRESS, THE OBJECT WILL HAVE VALUES FOR THE ADDRESS FIELD, AND SO ON
 * 
 *  - * AN OBJECT - IS CALLED AN INSTANCE OF A PARTICULAR CLASS.
 * 
 *  - * STATIC KEYWORD IS REQUIRED WHEN DECLARED ON CLASS.VALUE OF THE FIELD IS STORED IN SPECIAL MEMORY LOCATION AND ONLY IN ONE PLACE. VALUE IS ACCESSED BY ClassName.fieledname
 * 
 * Example: Integer.MAX_VALUE
 * 
 * 
 *  ** Instance Field -
 *  Omits 'static' keyword when declared on the class.
 * 
 *  Value of the field is not allocated any memory and has no value UNTIL the object is created.
 * 
 *  Value is accessed by ObjectVariable.fieldname
 * 
 *  Example my object.myFieldName ( myObject is our variable name for an object we create and myFieldName is an attribute on the class.)
 */



public class theClassObjectStaticInstanceAndMethod {
    
    public static void main(String[] args) {

        // Static Example(Class Integer) - Method is accessed by ClassName.methodName
        System.out.println(Integer.parseInt("123"));

        // Instance Example(Instance of String) - ObjectVariable.methodName
        System.out.println("hello".toUpperCase());
    }
}
