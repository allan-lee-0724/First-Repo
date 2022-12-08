public class Operators {
    /*
     * In Java you have a plethora of operators that can affect the way your code operates
     * One of the main groups of operators you should familiarize yourself with are the mathematical operators
     */

     public static void main(String[] args) {
        // = is the assignment operator: it assigns a value to a variable
        int add = 5 + 5; // add = 10
        int subtract = 5 - 5; // subtract = 0
        int multiply = 5 * 5; // multiply = 25
        int divide = 5 / 5; // divide = 1
        int modulus = 5 % 5; // modulus = 0

        /*
         * There are some nice quality of life mathematical operators that are good to know: you can take
         * one of the math operators and add the assignment operator to it in order to change the value
         * of the variable
         */

         int number = 5;
         System.out.println(number);
         number = number + 5; // this would increase the value of number by 5
         System.out.println(number);
         number += 5; // equivalent to number = number + 5
         System.out.println(number);

        /*
         * If you want to increase or decrease a value by 1 you can use the increment (++) or decrement (--)
         */

         int value = 5;
         value++; // this changes the value to 6
         System.out.println(value);

         //depending on whether you put the increment/decrement operator before or after your value you will
         //either see the change (if you put it before the value like ++x) or you won't (if you put it after like x++)

         value = 5;
         System.out.println(value++); // this will print out 5

         value = 5;
         System.out.println(++value); // this will print out 6

        /*
         * There are also logical operators you can see in action in the control flow java files, but here at
         * curated list of logical operators is as well
         * > greater than
         * < less than
         * >= greater than or equal to
         * <= less than or equal to
         * == equal
         * ! not operator (flips the requirement)
         * && logical and operator (let's you chain logical statements: both must be true)
         * || logical or operator (let's you chain logical statements: only one needs to be true)
         */

     }
}
