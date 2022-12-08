public class Loops {
    /*
     * Loops are another way of controlling the flow of your application. These are particularly useful when you
     * need an operation to happen multiple times. The easiest way to make this happen is with a for loop
     */

    /*
     * A for loop has three basic parts: a controlling value, a condition under which the loop continues, and 
     * a change to the controlling value
     */
    public static void main(String[] args) {
        for(int x = 0; x <= 10; x++){ // ++ is the increment operator, will increase x by one each iteration
            System.out.println(x);
         } 

        // if you set your loop up incorrectly, you will make an infinite loop and your code will be stuck
        // ctrl c in the terminal stops the terminal
        // for(int x = 0; x <= 10; x--){ // is the decrement operator, it will reduce the value of x
        //     System.out.println(x);
        // }

        // We can combine our loops and if statements to have fine-tune control over our application
        for(int x = 1; x <= 10; x++){
            if(x % 2 == 0){ // % is the modulus operator: it returns the remainder of a division operation
                System.out.println(x);
            }
        }

        // If I wanted to store int numbers and loop through them I could do so with an array
        int[] numbers = {1, 3, 5, 9, 15, 34, 73, 8, 7893274};
        // To access the contents of an array you use index positions: indexing starts at 0 and works its way up
        for(int x = 0; x < numbers.length; x++){
            if(numbers[x] % 2 == 0){
                System.out.println("x is even this iteration");
            } else{
                System.out.println("x is odd this iteration");
            }
        }

        // Another way you can loop your code is with a while loop
        int x = 0;
        while(x <= 10){
            System.out.println(x);
            x++;
        }

        /*
         * For loops are particularly useful when you know how many times you need to do something, or you are working through a data collection
         * A while loop is going to be more useful when you can't be sure how many times an operation needs to happen, or your exit condition
         * for the loop does not lend itself well to basic mathematics
         */

         x = 110;
         do{
            System.out.println(x);
            x++;
         } while(x <= 10);
    }
}
