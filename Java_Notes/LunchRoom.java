public class LunchRoom {
    public static void main(String[] args) {
        // Both options below are perfectly valid ways of creating Burrito and Croissant objects
        // We can reference their parent class, Food, as the type, and then make the spectific type of food object
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
