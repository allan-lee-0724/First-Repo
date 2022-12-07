public class LunchRoom {
    public static void main(String[] args) {
        // Both options below are perfectly valid ways of creating Burrito and Croissant objects
        // We can reference their parent class, Food, as the type, and then make the spectific type of food object
        // BE AWARE: if you set the type to the parent but define child specific method or field you will NOT have 
        // access to it if the type is of the parent (myBurrito loses access to the addSourCream method if its type is Food)
        Burrito myBurrito = new Burrito();
        Food myCroissant = new Croissant();

        myBurrito.eat();
        myCroissant.eat();

        System.out.println(); // just to put some space between the readouts

        myBurrito.cook();
        myCroissant.cook();

        System.out.println();

        myBurrito.store();
        myCroissant.store();

        System.out.println();

        myBurrito.addSourCream();
    }
}
