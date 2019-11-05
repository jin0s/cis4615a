/******************************************************************************
 *  Compilation:  javac R02_XP00_J.java
 *  Execution:    java R02_XP00_J
 *
 ******************************************************************************/

import java.io.File;
import java.io.IOException;

public  class R02_XP00_J {

 /*
  * Rule 02. Expressions (EXP)
  * Do not ignore values returned by methods Given the non-compliant code below
  */
  public static void deleteFile(){
    File someFile = new File("someFleName.txt");
    // Do something with someFile

    someFile.delete();
    System.out.println("Output from deleteFile(): ");
  }

   /*
    * Rule 02. Expressions (EXP)
    *
    * Corrected code per:
    * https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
    */

  public static void deleteFileCompliant(){
    File someFile = new File("someFleName.txt");
    // Do something with someFile
    String result;
    if(someFile.delete()){
      result = "success! filed deleted";
    }
    else {
      result = "failed! filed could not be deleted";
    }
    System.out.println("Output from deleteFile(): " + result);
  }

  public static void main(String[] args) {
    // Using Non-Compliant code ignoring values returned by methods resulting in no output or response of the delete status
    System.out.println("\nResult of Non-Compliant Code");
    deleteFile();


    // Using Compliant code using values returned by methods
    System.out.println("\nResult of Compliant Code");
    deleteFileCompliant();
  }
}




