package ca.bcit.comp1510.lab01;

/**
 * Prints a Hello World message.
 *  
 * @author BCIT
 * @version 2022
 */
public class Hello {

    /**
     * Prints the greeting.
     * 
     * @param args
     *            unused
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    /*
   a. The error message is like below.
      Could not find or load main class ca.bcit.comp1510.lab01.Hello
      Caused by: java.lang.ClassNotFoundException: ca.bcit.comp1510.lab01.Hello
   
   b. There's no error because inside the quotation marks is a just string type
      which is not related the name of class.
      The result has been changed to "Helo World!"     
   
   c. The error message is like below.
      Exception in thread "main" java.lang.Error: 
      Unresolved compilation problem: 
      String literal is not properly closed by 
      a double-quote at ca.bcit.comp1510.lab01.Hello.main(Hello.java:18)
      
   d. more than 3 error messages were occured.
   
   e.The error message is like below. 
     Exception in thread "main" java.lang.Error: 
     Unresolved compilation problem: 
     Syntax error, insert ";" to complete BlockStatements 
     at ca.bcit.comp1510.lab01.Hello.main(Hello.java:18)
     */
}
