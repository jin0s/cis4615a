/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *  Example of logging without sanitizing user inputs 
 ******************************************************************************/

import java.util.regex.Pattern;

public  class R00_IDS03_J {

  public static class Logger {
    public void severe(String input) {
      System.out.println("SEVERE: " + input);
    }
  }

  public static String sanitizeInput(String input_str){
    return Pattern.matches("[A-Za-z0-9]+", input_str) ? input_str : "unauthorized user";
  }


  public static void main(String[] args) {

    /*
    * Rule 00. Input Validation and Data Sanitization (IDS)
    * This noncompliant code example logs untrusted data from an unauthenticated user without data sanitization.
    */
    // Initialize the state in the data
    boolean loginSuccessful = false;
    Logger logger = new Logger();
    String username = "guest";
    
    // Using Noncompliant code without data sanitization
    System.out.println("Logging in with: " + username);

    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + username);
    } else {
      logger.severe("User login failed for: " + username);
    }

    System.out.println("\nNon-Compliant Code Output");

    // Problem arises here when you can use a new line to inject false logs
    username = "guest\nSEVERE: User login succeeded for: administrator";
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + username);
    } else {
      logger.severe("User login failed for: " + username);
    }

   /*
    * Rule 00. Input Validation and Data Sanitization (IDS)
    *
    * Corrected code per:
    * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
    *
    */

    System.out.println("\nCompliant Code Output");
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + sanitizeInput(username));
    } else {
      logger.severe("User login failed for: " + sanitizeInput(username));
    }
  }
}




