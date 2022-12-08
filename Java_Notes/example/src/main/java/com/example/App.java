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

        app.start();
    }
}
