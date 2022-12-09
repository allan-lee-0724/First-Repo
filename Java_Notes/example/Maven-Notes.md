# pom.xml
The page object model (pom) is where you tell Maven the relevant information about your maven project. Points of interest:
- Properties
    - This is where we tell Maven what version of Jave we are using
- Dependencies
    - This is where we tell Maven the third party libraries we want to integrate into our project
- Build
    - This is where we can add plugins to our project that affect the way Maven builds our application
        - A common use-case is to use the maven-surefire-plugin so that Maven will only build the application
        if all tests associated with the project pass