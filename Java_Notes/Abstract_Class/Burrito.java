
public class Burrito extends Food{

    public Burrito() {
    }

    public Burrito(String name, String taste, int calorieCount, boolean isCandy, boolean isCooked, String texture,
            String smell) {
        super(name, taste, calorieCount, isCandy, isCooked, texture, smell);
    }

    @Override
    public void eat() {
        System.out.println("chomp chomp");
        
    }

    @Override
    public void cook() {
        System.out.println("I chop the veggies, fry the meat, wrap them in a tortilla shell");
        this.isCooked = true;
        
    }

    @Override
    public void store() {
        System.out.println("I put the components of the burrito into the fridge");
        
    }

    
    public void addSourCream(){
        System.out.println("This will probably increase the calorie count...");
        this.calorieCount += 100;
    }


    
    
    
}
