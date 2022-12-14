package Exceptions_Practice;
import java.io.IOException;

public class UhOh {
    /*
     * Anytime something goes wrong in your code java will "throw" an exception. This is the default behavior
     * for handling things going wrong in your code. If you as a developer want to "handle" these exceptions you
     * have to make use of try/catch blocks
     */

     public static void main(String[] args) {
        try{
            System.out.println(10/0);
        } catch(ArithmeticException e){ // This exception is thrown if we try to divide by zero
            System.out.println(e.getMessage()); // We could print out the exception message
            System.out.println("You can't divide by zero: try again"); // We could also print out our own message
        }

        // // You can handle multiple exception exception types individually
        // try{
        //     // some code
        // } catch(IOException e){
        //     System.out.println("File could not be found");
        // } catch(ArithmeticException e){
        //     System.out.println("Can't do the maths");
        // }

        // //You can also handle them the same way using a pipe | to seperate the exception type
        // try{
        //     // some code
        // } catch(IOException | ArithmeticException e){
        //     System.out.println("Something went wrong");
        // }

        // // If you REALLY want to be generic you can just catch the base Exception exception: all other exceptions inherit from this one
        // try{
        //     // code that could go wrong
        // } catch(Exception e){
        //     System.out.println("If ANYTHING throws an exception this block of code will execute");
        // }
     }
}
