package Inheritance;
public class Dog extends Animal{
    
    public Dog() {
    }

    public Dog(int limbs, String name, String size, String eyeColor) {
        // syper is a reference to the parent class, in this case, the parent constructor with the same parameters
        super(limbs, name, size, eyeColor);
    }

    public static void main(String[] args) {
        // Notice that I set the type of data as Animal but I made a Dog object
        Animal myDog = new Dog(4, "Fido", "medium", "green");
        myDog.makeNoise();
        myDog.breath();
        System.out.println(myDog.name); // the name field comes from the parent Animal class
    }

    @Override // This annotation tells the compiler this method MUST implement or change the parent method
    public void breath(){
        System.out.println("pant pant");
    }

    @Override
    public void makeNoise(){
        System.out.println("bark bark");
    }
}
