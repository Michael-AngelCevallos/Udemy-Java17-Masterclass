# Udemy-Java17-Masterclass

// Download to windows

/** Jshell - run java commands directley in terminal without IDE
 * 
 * 1. open cmd prompt on windows/ terminal on mac
 * 2. type --->>  jshell
 * 3. press enter
 * 4. you can now run java output in t cmd prompt/terminal
 * 
 * example:  System.out.print("Hello World");
 * prints in cmd prompt --> Hello World
 *  */ 
/** JSHELL COMMANDS
 * 
 * /list-
 * /var - Shows all variables that have been declaredin this project
 * 
 * 
*/
//  Exit Jshell using ---> /exit

/**  VARIABLES - VARIABLES ARE A WAY TO STORE INFO IN YOUR COMPUTER

- 1. in java you must declare data type before variable name. Example:

int myFirstNumber =5;
*/

int myFirstNumber =5;
#############################################################################

# IF-THEN  STATMENT 

# NAMING ITEMS IN JAVA EXPECTATIONS
IDENTIFIER          USAGE              RECOMMENDED             EXAMPLE
Project Name       IntelliJ          Upper Camel Case      FirstJavaProject
Class Name         Java Element      Upper Camel Case           NewClass
Method Name        Java Element      Lower Camel case           getData
Variable Name      Java Element      Lower Camel Case         firstVariable

# OPERATORs IN JAVA - 
 * 
 * 
 * **Simple Assignment Operator - (=)
 * 
 * **Arithmetic Operators - 
 * 
 * (+) Additive operator (also used for String Concatenation)
 * (-) Subtraction Operator 
 * (*) Multiplication Operator
 * (/) Division Operator
 * (%) Remainder Operator 
 * 
 * 
 * Unary Operators 
 *  (+) Unary plus operator; indicates positive value (numbers are positive without this, however)
 * 
 *  (-) Unary minus operator, negates an expression
 * 
 *  (++) Increment operator; increments a value by 1
 * 
 *  (--) Decrement operator; decrements a value by 1 
 * 
 *  (!) Logical complement operator; inverts the value of a boolean
 * 
 * 
 * ** Equality and Relational Operators
 *  (==) - Equal-to value
 *  (!=) - Not Equal To
 *  (>)  - Greater Than
 *  (>=) - Greater than or equal to
 *  (<)  - Less Than 
 *  (<=) - Less than or equal to
 * 
 * Conditional Operators
    &&      Conditional-AND
    ||      Conditional-OR
    ?:      Ternary (shorthand for 
            if-then-else statement)
    Type Comparison Operator
    instanceof      Compares an object to 
                    a specified type 
    Bitwise and Bit Shift Operators
    ~       Unary bitwise complement
    <<      Signed left shift
    >>      Signed right shift
    >>>     Unsigned right shift
    &       Bitwise AND
    ^       Bitwise exclusive OR
    |       Bitwise inclusive OR
 * 
 * 

 # JAVA OPERATOR PRECEDENCE TABLE -  ** Larger number means higher precedence. **


   15 	() Parentheses      
        [] Array subscript            Left to Right
        .  Member selection
	

  14	      ++    Unary post-increment
        --	Unary post-decrement       Left to Right
	
  13	  ++   Unary pre-increment
          --   Unary pre-decrement
          +    Unary plus
          -    Unary minus                 Right to left
          !    Unary logical negation
          ~    Unary bitwise complement
    ( type )   Unary type cast	

12	      *   Multiplication
          /   Division               Left to right
	      %   Modulus	


11	      +   Addition
          -	  Subtraction            Left to right
	
10	     <<   Bitwise left shift
         >>   Bitwise right shift with sign extension
         >>>  Bitwise right shift with zero extension	

	
9	     <           Relational less than
         <=          Relational less than or equal
         >           Relational greater than                    Left to right
         >=          Relational greater than or equal
      instanceof	 Type comparison (objects only)

8	     ==      Relational is equal to
         !=	     Relational is not equal to      Left to right
	
7	     &	     Bitwise AND	          Left to right

6	     ^	     Bitwise exclusive OR	  Left to right

5	     |	     Bitwise inclusive OR	  Left to right

4	     &&	      Logical AND             Left to right

3	     ||	      Logical OR	          Left to right

2	     ?:	      Ternary conditional	  Right to left

1	     =       Assignment
        +=       Addition assignment
        -=       Subtraction assignment
        *=       Multiplication assignment        Right to left
        /=       Division assignment
        %=	     Modulus assignment


# ** EXPRESSION - AN EXPRESSION COMPUTES TO A SINGLE VALUE.
 *  ** STATEMENT - STATEMENTS ARE STAND ALONE UNITS OF WORK
 *  ** CODE BLOCKS - A CODE BLOCK IS A SET OF ZERO , ONE, OR MORE STATEMENTS, USUALLY GROUPED TOGETHER IN SOME WAY TO ACHIEVE A SINGLE GOAL.

	
# DEBUGGER - IN THE IDE, INSTEAD OF JUST RUNNING THE PROGRAM WE CAN USE THE DEBUGGER TO INTERFERE WITH THE PROGRAM EXECUTION AND PROVIDE YOU WITH THE INFORMATION ON WHATS HAPPENING UNDER THE HODD. THE IS A PROCESS TO DETECT AND FIX PROBLEMS/BUGS INYOUR PROGRAM.

# BREAKPOINTS - A WAY TO COMMENT OUT SOME CODE SO IT IS NOT RUN WHEN THE PROGRAMMER IS RAN. SIMPLY FIND THE LINE OF CODE YOU WISH TO BREAK OUT, MOVE OVER TO THE LEFT WHERE THE NUMBER ARE, CLICK IN THE BLANK SPACE, IT SHOULD NOW HAVE A RED DOT NEXT TO IT.      



                    ******* TABLE OF CONTENTS *****
  1. VARIABLES
  2. EXPRESSIONS
  3. CASTING
  4. PRIMITIVE TYPE CHALLENGES
  5. FLOAT AND DOUBLE PRIMITIVES
  6. FLOATING POINT CHALLENGE
  7. CHAR AND BOOLEAN PRIMITIVES
  8. OPERATORS,OPERANDS, AND EXPRESSIONS
  9. ABBREVIATING OPERATORS (+=, ++ LESSON)
 10. IF-THEN STATEMENT (CONDITIONS)
 11. LOGICAL AND OPERATOR (&&)
 12. LOGICAL OR OPERATOR (||)
 13. ASSIGNMENT OPERATOR VS EQUAL-TO OPERATOR (=/==)
 14. Tenary Operator (Operand1 ? Operand2 : Operand3) / (makeOfCar != "Volkswagen")
 15. OPERATOR PREDECEDENCE AND OPERATOR CHALLENGE
 16. KEYWORDS AND EXPRESSIONS
 17. IF- ELSE IF -ELSE Statements
 18. IF-THEN-ELSE CHALLENGE 
 19. METHODS IN JAVA
 20. METHODS CHALLENGE
 21. SAMPLE CODING EXERCISE

 22. SPEED CONVERTER Code Exercise  *****
 23. MEGABYTES CONVERTER CODE EXERCISE *****
 24. BARKING DOG CODE EXERCISE ******
 25. LEAP YEAR CALCULATOR CODE EXERCISE *******
 26. DECIMAL COMPARATOR CODE EXERCISE ********
 27. EQUAL SUM CHECKER CODE EXERCISE ******
 28. TEEN NUMBER CHECKER CODE EXERCISE *****

# METHOD OVERLOADING 
 29. METHOD OVERLOADING 
 30. METHOD OVERLOADING CHALLENGE
 31. SECONDS AND MINUTES CHALLENGE

 32. AREA CALCULATOR CODE EXERCISE ******
 33. MINUTES TO YEARS DAYS CALCULATOR CODE EXERCISE *******
 34. EQUALITY PRINTER CODE EXERCISE *******
 35. PLAYING CAT CODE EXERCISE ****

 # CONTROL FLOW (SWITCH STATEMENTS, FOR STATEMENT, WHILE STATEMENT, DO WHILE STATEMENT)
 36. SWITCH STATEMENT 
 37. Traditional Switch Challenge
 38. Switch Expression Challenge

 39. Number In Word Code Exercise *******
 40. Number Of Days In A Month
 
 41. The 'FOR' Statement (Looping A SET NUMBER OF TIMES)
 42. For Statement Challenge (isPrimeNumber *****)
 43. Sum 3 and 5 Challenge

 44. SUM ODD CODING EXERCISE *****

 45. WHILE AND DO WHILE Loops (FOR LOOP FUNCTIONS THAT MEET A CONDITION, 'WITHOUT' A KNOWN RANGE OF VALUES)    
 46. WHILE LOOP CHALLEGE  

 47. Digit Sum Challenge (** Write a method, called sumDigits, that has a single parameter named number, with the parameter type int, and should return an int.) 

 48. The While and Do While Loop Recap       

 # Local Variables Vs Scope
 49. Local Variables and Scope    
 50. The Class, the Object, Static & Instance Fields and Methods   

 51. NUMBERPALINDROME CODE EXERCISE *******
 52. FIRST AND LAST DIGIT SUM CODE EXERCISE ****** 
 53. EVEN DIGIT SUM CODE EXERCISE *****  
 54. SHARED DIGIT CODE EXERCISE *******
 55. LAST DIGIT CHECKER CODE EXERCISE ***** 
 56. ALL FACTORS CODE EXERCISE *****  
 57. GREATEST COMMON DIVISOR CODE EXERCISE ******
 58. PERFECT NUMBER CODE EXERCISE ******
 59. FLOUR PACKER CODE EXERCISE ******
 60. LARGEST PRIME CODE EXERCISE ******
 61. DIAGONAL STAR CODE EXERCISE ******

 62. Parsing Values and Reading Input Using Sout (** System.console.readline() **)

 # EXCEPTION HANDLING AND INTRO TO SCANNER
 63. Exception Handling, Introduction To Scanner, AND TRY STATEMENTS
 64. Reading input with Scanner
 65. Reading User Input Challenge
 66. Min and Max Challenge
 67. INPUT CALCULATOR EXERCISE





                                                                                                                                                                                                                                                                                                                                                                                                     


 
