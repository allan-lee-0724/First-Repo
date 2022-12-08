public class Croissant extends Food{

    public Croissant() {
    }

    public Croissant(String name, String taste, int calorieCount, boolean isCandy, boolean isCooked, String texture,
            String smell) {
        super(name, taste, calorieCount, isCandy, isCooked, texture, smell);
    }

    @Override
    public void cook() {
        System.out.println("Make the dough, bake it for just the right amount of time at just the right temp");
        this.isCooked = true;
        
    }

    @Override
    public void eat() {
        System.out.println("Tenderly hold the bread and take a nibble");
        
    }

    @Override
    public void store() {
        System.out.println("What are you doing?! You want to eat these things fresh!");
        
    }
    

    
}
