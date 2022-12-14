package com.example;

import io.javalin.Javalin;
import java.util.*;

/**
 * All Maven projects have their code stored inside of a src/main/java directory. Now, the reason I also have a "com" package
 * and inside of that one there is a package called "example" is because the Maven project generator names your base package
 * structure after the groupId you set when you set up your project. What this means is that all of your Java code is going to, 
 * at a minimum, have a "package com.example" to start it off in order to let Maven know where the code is when it builds 
 * our application
 *
 */
public class App 
{
    public static List<String> names = new ArrayList<String>();
    public static void main( String[] args ){

        // Adding some names to the names list so we can interact with them via http
        names.add("Billy");
        names.add("Sally");
        names.add("Bruce");

        Javalin app = Javalin.create();

        /*
         * The code below tells Javalin that our web server that is created needs to be able to handle a 
         * GET http request that ends with /hello. Upon our applicaiton receiving this request, the application
         * should return the text "Hello world!" to the requester
         */
        app.get("/hello", ctx -> ctx.result("Hello world!"));

        app.post("/add", ctx -> {
            // We get the name from the http request body and save it to a variable
            String newName = ctx.body();
            // We add the new name into the list of names
            names.add(newName);
            // We tell Javalin we want to return a String message to the requester
            ctx.result("Congrats! You added a new name to the names database");
            // We tell Javalin we want the status code 201 returned in the response
            ctx.status(201);
        });

        app.get("/person/{num}", ctx -> {
            // We use the pathParam method to get the value of the num path parameter
            String numAsString = ctx.pathParam("num");
            // Since the value is a number, we convert the string into an int
            int num = Integer.parseInt(numAsString);
            // We use out newly converted int to access the index position of the name we want
            String person = names.get(num);
            // We tell Javalin to return the name of the person we got
            ctx.result(person);
            // We tell Javalin to set the status code to 200
            ctx.status(200);
        });

        // This is an example of how you could inform the user that they requested a name out of bound
        app.get("/protectedGet/{num}", ctx -> {
            String numAsString = ctx.pathParam("num");
            int num = Integer.parseInt(numAsString);
            try{
                String person = names.get(num);
                ctx.result(person);
                ctx.status(200);
            } catch (IndexOutOfBoundsException e){
                ctx.result("No person found at that index position");
                ctx.status(404);
            }
        });

        app.put("/replace/{num}", ctx -> {
            // Get the index position from the path as a string
            String numAsString = ctx.pathParam("num");
            // Convert string index position to an int
            int num = Integer.parseInt(numAsString);
            // Get the string value we will be replacing the current data with
            String replacePerson = ctx.body();
            // Use the set method to replace the old name with the new name
            names.set(num, replacePerson);
            // Tell Javalin to give a success message and status code back to the user
            ctx.result("Replaced person successfully!");
            ctx.status(200);
        });

        app.patch("/update/{num}", ctx ->{
            String numAsString = ctx.pathParam("num");
            int num = Integer.parseInt(numAsString);
            String updatedInformation = ctx.body();
            names.set(num, updatedInformation);
            ctx.result("Updated person successfully!");
            ctx.status(200);
        });

        app.delete("/delete", ctx -> {
            names.clear();
            ctx.result("All names have been removed from the database");
            ctx.status(200);
        });

        app.start();
    }
}
