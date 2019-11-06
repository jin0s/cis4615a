import java.io.File;

/******************************************************************************
 * Compilation: javac R13_FIO02_J.java 
 * Execution: java R13_FIO02_J
 *
 ******************************************************************************/

public  class R13_FIO02_J {


  public static void main(String[] args) {
   

    // This noncompliant code example attempts to delete a specified file but gives no indication of its success. 
    System.out.println("\nResult of Non-Compliant Code");
    File file = new File("filethatdonotexist.txt");
    file.delete();
    System.out.println("I guess the file was deleted?");

     /*
      * Rule 13. Input Output (FIO)
      * Detect and handle file-related errors
      */

    // Using Compliant code using values returned by methods
    System.out.println("\nResult of Compliant Code");
    file = new File("filethatdonotexist.txt");
    if (!file.delete()) {
      System.out.println("Deletion failed");
    } else {
      System.out.println("I guess the file was deleted?");
    }

  }
}




