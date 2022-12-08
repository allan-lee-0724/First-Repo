public class Calculator implements Maths{

    @Override
    public void add(float numOne, float numTwo) {
        // Math is a class provided by Java itself, round is on of its methods
        int intOne = Math.round(numOne); // This will convert our float to an int by rounding it
        int intTwo = Math.round(numTwo);
        System.out.println(intOne + intTwo); // We print the value of our rounded numbers to the console
        
    }

    @Override
    public void subtract(float numOne, float numTwo) {
        int intOne = Math.round(numOne); 
        int intTwo = Math.round(numTwo);
        System.out.println(intOne - intTwo);
        
    }

    @Override
    public void multiply(float numOne, float numTwo) {
        int intOne = Math.round(numOne); 
        int intTwo = Math.round(numTwo);
        System.out.println(intOne * intTwo);
        
    }

    @Override
    public void divide(float numOne, float numTwo) {
        int intOne = Math.round(numOne); 
        int intTwo = Math.round(numTwo);
        System.out.println(intOne / intTwo);
        
    }
    
}
