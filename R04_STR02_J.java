/******************************************************************************
 *  Compilation:  javac R04_STR02_J.java
 *  Execution:    java -Duser.language=tr R04_STR02_J
 *
 ******************************************************************************/
import java.util.Locale;

public class R04_STR02_J {


  public static void main(String[] args) {
    // Using Non-Compliant code ignoring values returned by methods resulting in no output or response of the delete status
    System.out.println("\nResult of Non-Compliant Code to output the string \'TITLE\'");
    System.out.println("Title".toUpperCase());
    

   /*
    * Rule 02. Characters and Strings (STR)
    * Specify an appropriate locale when comparing locale-dependent data
    */

    // Using Compliant code using explicitly set locale to English
    System.out.println("\nResult of Compliant Code to output the string \'TITLE\'");
    System.out.println("Title".toUpperCase(Locale.ENGLISH));
  }
}







