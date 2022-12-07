# Java
Java is a well known enterprise programming language. 
As a language it is well designed to scale in size and capabilities.
There are a few key details you should know about the language:
    - Java is a **strongly typed language**
        - Once a data type is set, it cannot be changed
    - Java is a **statically typed language**
        - You must declare the data type you are working with every time you create data in your java application
    - Java has automatic memory management
        - Java will handle all memory management and garbage collection for you
        - Garbage collection is the removal of data from memory that we are no longer using
    - Write once, run anywhere
        - Any machine that has a JRE/JVM on it can run a Java app, no matter where that app was made
            - A Java app designed on a Mac can run just fine on a Windows machine as long as the Windows machine has a JRE


## JDK, JRE, JVM
The Java Development Kit (JDK) contains the libraries and tools we need to be able to write out Java applications.
One of the key tools we need is the Java compiler: this is what allows us to turn our source code (.java files) into byte code that can be executed on our computer (.class files)
It also provides a debugger that can be helpful if figuring out issues with our code.

A Java Runtime Environment (JRE) is provided with the JDK when you download it. A JRE is what is needed to actually be able to run your Java application. The JRE contains the runtime libraries necessary for your code to execute. 
// when downloading JDK, JRE will be downloaded automatically. however, JRE could be downloaded independently from JDK
Contained within the JRE is the JAVA Virtual Machine (JVM), which is the tool that actually handles ensuring your code will run on your machine.

The JVM is the tool that takes the byte code (.class files) and turns it into data that is understandable by your particular operating system.
Keep in mind, all JVMs are found in their respective Java Runtime Environment


## Classes & Objects
Java is an object Oriented Programming language: this means that everything is tied to classes and objects.
Classes in Java are like blueprints: they contain the information needed for your code to work.
Objects in Java are the implementation of the blueprints.
It is important to remember that objects do not share the value of their fields with one another: the values are unique to the object
when these fields are part of the instance/object scope.


## Interfaces
If Classes are blueprints for objects, Interfaces are more like contract agreements for classes. If a class "implements" an interface 
it is like an agreement has been made that the class will, somehow, implement the features of the interface. Interfaces are also unique in that a class can implement multiple interfaces, whereas only a single class can be extended


## When to use Abstract vs. Interface
If the only thing that needs to be shared is methods then use an interface
If you also need to share fields (variables associated with the objects) then use an Abstract class