package Exceptions_Practice;
public class ExceptionsPlayground {
    public static void main(String[] args) {
        
        String[] names = {"Ted", "Sally", "George", "Billy", "Fred"};
        // this try-catch block handles NoBilly exception and therefore the NoBilly.java could extend either Exception or RuntimeException
        try{
            for(int x = 0; x < names.length; x++){
                if(names[x].equals("Billy")){
                    throw new NoBilly("No Billys allowed!");
                } else{
                    System.out.println("No Billy found here, continuing on");
                }
            }
        } catch(NoBilly e){
            // I'm still just printing the exception message, but I COULD handle the problem here if I wanted to
            System.out.println(e.getMessage());
        }

        try{
            checkForFred(); // If we do not put checkForFred in try-catch block we will get a compilation error
        } catch(NoFred e){
            System.out.println(e.getMessage());
        }
    }

    // Because we added the throws NoFred keywords to out method we can throw our checked exception in this method
    // but not worry about handling it with a try-catch block: that is done for us in the main method where this
    // checkForFred method is called
    public static void checkForFred() throws NoFred{
        String[] names = {"Ted", "Sally", "George", "Billy", "Fred"};
        // this try-catch block handles NoBilly exception and therefore the NoBilly.java could extend either Exception or RuntimeException
        for(int x = 0; x < names.length; x++){
            if(names[x].equals("Billy")){
                throw new NoFred("No Freds allowed!");
            } else{
                System.out.println("No Billy found here, continuing on");
            }
        }
    }
}
