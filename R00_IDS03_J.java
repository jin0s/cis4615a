/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 *  Calls function getAbsAdd(x,y) with legal and illegal values
 *
 ******************************************************************************/

import java.util.Scanner;

public  class R00_IDS03_J {

    /*
    * Rule 06. Methods (MET)
    * Corrected code per:
    * https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments
    *
    *Rule 06-Met01
     */

  public static class Logger {
    public void severe(String input) {
      System.out.println("SEVERE: " + input);
    }
  }


  public static void main(String[] args) {
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

      // Problem arises here when you can use a new line to inject false logs
      username = "guest\nSEVERE: User login succeeded for: administrator";
      if (loginSuccessful) {
        logger.severe("User login succeeded for: " + username);
      } else {
        logger.severe("User login failed for: " + username);
      }
  }
}




