import javax.management.RuntimeErrorException;

public class Methods {
    /*
     * Methods are reusable code that is attached to a class or interface. They are useful when you need to repeatedly
     * execute some code but don't exactly known when will need to be executed. Instead of having to rewrite
     * your code, you just call the method you create
     */

    /*
     * public is the access modifier: this method can be referenced anywhere in our code
     * void is the return type: this method does not return any data
     * doSomething is the name of the method, so it is how we actually invoke the method
     * input is the name of the parameter associated with the method: whatever String we provide the method
     * will be referenced by the variable input inside of the method
     */

     public static void main(String[] args) {
        Methods obj = new Methods();
        obj.doSomething("Oogie Boogie");
        obj.addFive(6); // this by itself doesn't do anything for us: we need to assign the return value to a variable
        
        // This is one way to interact with the returned value from the addFive method
        int returnValue = obj.addFive(6); // Notice I have to set the data type of my variable the same as the return type of the method
        System.out.println(returnValue);

        // This will accomplish the same goal as above, but I can't reuse the result of the addFive method somewhere else
        System.out.println(obj.addFive(6));
        
        try{
            obj.exceptionHappen(0);
        } catch(RuntimeException e){
            System.out.println("Error message can go here");
        }
    }

     public void doSomething(String input){
        System.out.println("You entered the string: " + input); // We do dome string concatenation and print the result to the console
     }

     public int addFive(int num){
        return num + 5;
     }

     public int exceptionHappen(int num){
        // You can either return the expected data type or you can throw an exception: it must be one or the other
        try{
            return 100 / num;
        } catch(ArithmeticException e){
            throw new RuntimeException("Can't divide by zero");
        }
     }
}
