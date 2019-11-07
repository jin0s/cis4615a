/******************************************************************************
 *  Compilation:  javac R04_STR02_J.java
 *  Execution:    java -Duser.language=tr R04_STR02_J
 *  Example of not considering locale
 ******************************************************************************/
import java.util.Locale;

public class R04_STR02_J {


  public static void main(String[] args) {
    // Using Non-Compliant code ignoring the possibilty of different locale
    System.out.println("\nResult of Non-Compliant Code to output the string \'TITLE\'");
    System.out.println("IMPORTANT! : Make sure you run the program as \"java -Duser.language=tr R04_STR02_J\" to see the affects");
    System.out.println("Output " + "Title".toUpperCase());
    

   /*
    * Rule 04. Characters and Strings (STR)
    * Specify an appropriate locale when comparing locale-dependent data
    * Per: https://wiki.sei.cmu.edu/confluence/display/java/STR02-J.+Specify+an+appropriate+locale+when+comparing+locale-dependent+data
    */

    // Using Compliant code using explicitly set locale to English
    System.out.println("\nResult of Compliant Code to output the string \'TITLE\'");
    System.out.println("Output " + "Title".toUpperCase(Locale.ENGLISH));
  }
}







