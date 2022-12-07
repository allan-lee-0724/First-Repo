public class Car {
    // For this example we can pretend we are writing an app for a car videogame

    // All cars are going to share some properties in our code
    public String owner;
    public int gas;
    public static int count; // anytime you see the static keyword in a class know that the field/method is SHARED across all instances of the class

    // All classes have a special method (methods are repeatable code) that handles creating an object
    // of the class. This is called instantiation.

    // What we are doing here is creating our own constructor that handles setting the value of the owner
    // field when any car object is created
    public Car(String startingOwner, int startingGas){
        // "this" is a reference to the object being created
        // We are setting whatever the value of startingOwner is to the object's owner field
        this.owner = startingOwner;
        this.gas = startingGas;
        count ++; // Notice I don't need the "this" keyword, since the field is shared across all objects of the Car class
    }

    // You can create more than one constructor, the compiler will know how to handle them in your code
    // depending on the arguments you provide.
    public Car(){
        count ++; // Notice I don't need the "this" keyword, since the field is shared across all objects of the Car class
    }

    public static void main(String[] args) {
        System.out.println(Car.count); // This should say 0 because no cars have been made at this point

        Car georgeClooneyCar = new Car(); // anytime you see () after a word or phrase you know it is a method being called
        System.out.println(Car.count);

        georgeClooneyCar.owner = "George Clooney"; // Here we set the value of the owner property for the Car "myCar"

        System.out.println(georgeClooneyCar.owner); // Here we confirm that George Clooney is in fact the owner

        Car mattDamonCar = new Car("Matt Damon", 100);
        System.out.println(Car.count);

        System.out.println(mattDamonCar.owner);
        System.out.println(mattDamonCar.gas);
        System.out.println(georgeClooneyCar.owner);
        System.out.println(georgeClooneyCar.gas);

        // To call the drive method I MUST have a Car object to do it: I can't call the method by itself
        mattDamonCar.drive(); // make sure not to forget the () when you call a method

        System.out.println(mattDamonCar.gas);
        System.out.println(georgeClooneyCar.gas);

        Car.checkCount();
    }

    /*
     * public: access modifier, in this case, we are saying this method can be called by any object anywhere in our code
     * void: return type, in this case, we are saying this method does not return any data
     * drive: name of our method, method names should give a decent idea of what is being accomplished by your code
     */
    public void drive(){
        System.out.println("vroom vroom");
        this.gas -= 10;
    }

    // By adding the static keyword to the method we indicate the method belongs to the class proper, and so is called by the class, not individual objects
    public static void checkCount(){
        System.out.println("There are " + count + " cars created");
    }
}
