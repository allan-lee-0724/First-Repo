public class ControlFlow {
    /*
     * When we are talking about control flow we are discussing the tools available to us to determine what parts 
     * of our code execute, when they should execute, and the conditions under which they will execute
     */

     // Reminder: you MUST have a main method if you want to execute your Java code
     public static void main(String[] args) {
        int visaCard = 100; // this visaCard variable represents the $100 you got for your birthday
        int burgerCost = 45; // this burgerCost variable represents the $45 charge for the nice burger you want to get

        if(visaCard >= burgerCost){
            System.out.println("Congrats on buying a burger! Gordon Ramsay is pleased to serve you today");
        }

        int lowCard = 40; // you've used your card a couple of times now, so there is less money on it

        if(lowCard >= burgerCost){
            System.out.println("Congrats on buying a burger! Gordon Ramsay is pleased to serve you today");
        }


        /*
         * So far we have just looked at the >= operator, but there are many other options we can use
         * > greater than
         * < less than
         * >= greater or equal
         * <= less or equal
         * == equal
         */


         int numOne = 10;
         int numTwo = 32;

         if(numOne > numTwo){
            System.out.println("Will this phrase show?");
         }
         if(numOne < numTwo){
            System.out.println("Will this phrase show?");
         }
         if(numOne >= numTwo){
            System.out.println("Will this phrase show?");
         }
         if(numOne <= numTwo){
            System.out.println("Will this phrase show?");
         }
         if(numOne == numTwo){
            System.out.println("Will this phrase show?");
         }

         int newCard = 100;
         int pizzaCost = 5;

         // So far we have been looking at executing our code on a true statement
         if(newCard >= pizzaCost){
            System.out.println("Enjoy your pizza");
         }

         // You can inverse your logic by using the not operator !
        // By using the not operator we tell the if statement to trigger on a false statement instead of a true one
         int balance = 75;
         int expectedBalance = 85;
         if(balance != expectedBalance){
            System.out.println("Where is my money!");
         }
     }
}
