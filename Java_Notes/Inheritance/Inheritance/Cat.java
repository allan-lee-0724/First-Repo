package Inheritance;
public class Cat extends Animal{
    
    public Cat(){

    }

    public Cat(int limbs, String name, String size, String eyeColor){
        super(limbs, name, size, eyeColor);
    }

    public static void main(String[] args) {
        // Unlike the dog object, here I set the type as Cat and made a cat object
        Cat myCat = new Cat(4, "Shadow", "small", "orange");
        myCat.breath();
        myCat.makeNoise();
        System.out.println(myCat.name); // the name field comes from the child Cat class
    }

    @Override
    public void breath(){
        System.out.println("pur");
    }

    @Override
    public void makeNoise(){
        System.out.println("meow");
    }
}
